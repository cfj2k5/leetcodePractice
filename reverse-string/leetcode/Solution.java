/* Simple: Reverse a string. I saw this interesting answer and after writing it out and working it, I believe this 
 * is much more efficent than the naiive "count backwards and append" method... O(n).
 *
 * Here, we are using a recursive approach than results in something like o(n log(n) )
 *
 *
 */

package leetcode;

class Solution{
	public static void main(String[] args){
		if(args.length < 1){
			System.out.println("Enter a string after the program name.");
			return;
		}
		System.out.println("The reverse of " + args[0] + " is " + reverseString(args[0]));
	}

	static String reverseString(String s){
		if(s.length() <= 1){
			return s;
		}
		int length = s.length();
		String leftSub = s.substring(0, length/2);
		String rightSub = s.substring(length/2, length);
		return reverseString(rightSub) + reverseString(leftSub);
	}

}
