/*
Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
Example: 
Input: 1->2->4, 1->3->4
Output: 1->1->2->3->4->4
 */

/* 
 * Big assumption: they are sorted.
 *
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

/*
 * The answer was accepted.
 * Runtime was average. 
 *
 */

package leetcode;

import leetcode.ListNode;


class Solution {
	public static void main(String[] args){
		/* constructing tests */
		ListNode left = new ListNode(1);
		left.next = new ListNode(2);
		left.next.next = new ListNode(4);

		ListNode right = new ListNode(1);
		right.next = new ListNode(3);
		right.next.next = new ListNode(4);

		System.out.println("Result:");
		ListNode answer = mergeTwoLists(left, right);
		while(answer != null){
			System.out.print(answer.val + "->");
			answer = answer.next;
		}
	}

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) return null;
        if(l1 == null){
            ListNode result = new ListNode(l2.val);
            result.next = mergeTwoLists(l1, l2.next);
            return result;
        }
        if(l2 == null){
            ListNode result = new ListNode(l1.val);
            result.next = mergeTwoLists(l1.next, l2);
            return result;
        }
        if(l1.val >= l2.val){
            ListNode result = new ListNode(l2.val);
            result.next = mergeTwoLists(l1, l2.next);
            return result;
        }
        else{
            /* l1.val < l2.val */
            ListNode result = new ListNode(l1.val);
            result.next = mergeTwoLists(l1.next, l2);
            return result;
        }
    }
}
