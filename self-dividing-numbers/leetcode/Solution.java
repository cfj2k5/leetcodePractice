/*
A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.

Also, a self-dividing number is not allowed to contain the digit zero.

Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.

Example 1:
Input:
left = 1, right = 22
Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
Note:

The boundaries of each input argument are 1 <= left <= right <= 10000.

*/


/* Note: Initial solution while naiive, worked fine. I like the other solution mentioned
 * in the answers better, called selfDividingNumbers2.
 *
 *
 */

package leetcode;

import java.util.*;


class Solution{
	public static void main(String[] args){
		if(args.length < 2){
			System.out.println("Usage: <left integer> <right integer>");
		}
		int l = Integer.decode(args[0]);
		int r = Integer.decode(args[1]);
		List<Integer> answer = selfDividingNumbers(l, r);
		if(answer == null){
			return;
		}
		System.out.println("selfDividingNumbers: ");
		System.out.print("Answers: [ ");
		for(Iterator<Integer> iter = answer.iterator(); iter.hasNext(); ){
			System.out.print(iter.next() + " ");
		}
		System.out.print("]\n");

		System.out.println("selfDividingNumbers2: ");
		System.out.print("Answers: [ ");
		for(Iterator<Integer> iter = answer.iterator(); iter.hasNext(); ){
			System.out.print(iter.next() + " ");
		}
		System.out.print("]\n");
	}

	public static List<Integer> selfDividingNumbers(int left, int right){
		if(left < 0 || right > 10000){
			return null;
		}
		List<Integer> ansList = new ArrayList<Integer>();
		for(int i = left; i <= right; i++){
			int failedTest = 0;
			String numStr = Integer.toString(i);
			for(int j = 0; j < numStr.length(); j++){
				if(Character.digit(numStr.charAt(j), 10) != 0){
					if(i % Character.digit(numStr.charAt(j), 10) != 0){
						failedTest = 1;
					}
				}else{
					failedTest = 1;
				}
			}
			if(failedTest == 0){
				ansList.add(i);
			}	
		}
		return ansList;
	} /* selfDividingNumber */

	public static List<Integer> selfDividingNumbers2(int left, int right){
		List<Integer> answer = new ArrayList<Integer>();
		for(int i = left; i <= right; i++){
			if(checkDividedNum(i) == 1){
				answer.add(i);
			}
		}
		return answer;
	}/* selfDividingNumbers2 */
	
	private static int checkDividedNum(int num){
		int temp = num;
		while(temp > 0){
			int remainder = temp % 10; 
			temp /= 10;
			if(remainder == 0 || (num % remainder > 0) ){
				return 0;
			}
		}
		return 1;
	}/* checkDividedNum */
}


