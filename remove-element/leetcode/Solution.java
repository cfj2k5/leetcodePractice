/*
Given an array and a value, remove all instances of that value in-place and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
The order of elements can be changed. It doesn't matter what you leave beyond the new length.
Example:
Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2.

*/

/*
	The solution was accepted and beat 88% of other solutions' run times.
*/

package leetcode;


class Solution
{
	public static void main(String[] args){
		int[] n = {1,2, 3, 4, 5, 7, 7, 8, 10};
		int removeNum = 3;
		int newArraySize;
		System.out.println("This is the original array of size " + n.length + ": ");
		for(int i = 0; i < n.length; i++){
			System.out.print(n[i] + " ");
		}
		System.out.println("\n");
		newArraySize = removeElement(n, removeNum);
	        System.out.println("This is the re arranged array:");
		for(int i = 0; i < n.length; i++){
			System.out.print(n[i] + " ");
		}
		System.out.print("\n");
		System.out.println("This is the new array of returned size: " + newArraySize);
		for(int i = 0; i < newArraySize; i++){
			System.out.print(n[i] + " ");
		}
		System.out.print("\n");
	}

	public static int removeElement(int[] nums, int val){
		int j = 0; /* index to new array length */
		for(int i = 0; i < nums.length; i++){
			if(nums[i] != val){
				nums[j] = nums[i];
				j++;
			}
		}
		return j; /* returning the 0 indexed offset */
	}
}
