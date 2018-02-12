/*
 * Question:
 *
 * Given a positive integer, output its complement number. The complement strategy is to flip the bits of its binary representation.

Note:
The given integer is guaranteed to fit within the range of a 32-bit signed integer.
You could assume no leading zero bit in the integer’s binary representation.
*/


/* Solution was accepted. After reviewing discussion board, there were a lot of similar answers.
 *
 *
 */

package leetcode;

class Solution{
	public static void main(String[] args){
		if(args.length < 0){
			System.out.println("Enter one argument.");
		}
		System.out.println("Complement of " + args[0] + " is " + findComplement(Integer.decode(args[0])));
	}

	public static int findComplement(int num){
		if(num  < 0){
			return 0;
		}
		int mask = 0xFFFFFFFF;
		mask <<= findLastBit(num)+1;
		mask = ~mask;
		System.out.println("Mask : " + mask + ", ~num : " + ~num);
		return ~num & mask;
	}

	public static int findLastBit(int num)
	{
		int highestBit = 0;
		for(int i = 0; i < 32; i++){
			if(((0x01 << i) & num) != 0){
				highestBit = i;
			}
		}
		System.out.println("Highest bit: " + highestBit);
		return highestBit;
	}

}
