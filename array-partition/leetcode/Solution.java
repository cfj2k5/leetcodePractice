package leetcode;

import java.util.*;


/* Further explanation: The question is not specific enough that we want to maximize the values of the smallest pairs, 
 * This also means that we can't use the same two numbers in the pair twice (like (4,3) and (3,2) in their example.
 */

class Solution {
	public static void main(String[] args){
		int[] sample = {1, 4, 3, 2};
		System.out.println("Maximum value of pairs: " + arrayPairSum(sample));
	}

    public static int arrayPairSum(int[] nums) {
    	/* sorting array first to get the minimum number adjacent to each other */
	    Arrays.sort(nums);
	    int sum = 0;
	    /* adding the n pairs (length of array/2) to get the min */
	    for(int i = 0; i < nums.length; i += 2){
		sum += nums[i];
	    }
    	return sum;
    }/* arrayPairSum */
}
