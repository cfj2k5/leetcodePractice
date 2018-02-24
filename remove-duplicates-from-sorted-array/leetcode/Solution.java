/*
Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
Example: 
Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the new length.

*/

/*
 * Will only work if array is sorted (as stated in problem)
 *
 * Not sure if counter variable will violate the O(1) requirement for *this* sights solution.
 *
 */

/*

  The solution was accepted.

 The runtime is in the top 30% of submissions.

 We may have better run time in C by the looks of the discussions. This solution already has
  a good minimum of operations. Will consider this acceptable. 

*/

package leetcode;

class Solution{
	public static void main(String[] args){
		int[] n = {1, 1, 2, 3};
		System.out.println("Original array:");
		for(int i = 0; i < n.length; i++){
			System.out.print(n[i] + " ");
		}
		System.out.print("\n");
		int newLength = removeDuplicates(n);
		System.out.println("This is the size: " + newLength);
		System.out.println("The whole array:");
		for(int i = 0; i < n.length; i++){
			System.out.print(n[i] + " ");
		}
		System.out.println("\n");
		System.out.println("The dedupped array:");
		for(int i = 0; i < newLength; i++){
			System.out.print(n[i] + " ");
		}
		System.out.println("\n");
	}

	public static int removeDuplicates(int[] nums){
		/* edge case */
		if(nums.length < 2){
			return nums.length;
		}

		/* index for 'de dupped' array */
		int j = 0;
		for(int i = 0; i < nums.length; i++){
			/* if there is not a duplicate number, increment 'new' index
			 * and propogate the changes to the correct array location.
			 * */
			if(nums[i] > nums[j]){
				j++;
				nums[j] = nums[i];
			}	
		}
		/* increment for index starting at 0 */
		return j+1;
	}

}
