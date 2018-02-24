/*
Implement strStr(). 
Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack. 
Example 1: 
Input: haystack = "hello", needle = "ll"
Output: 2

Example 2: 
Input: haystack = "aaaaa", needle = "bba"
Output: -1

*/

/* First try, naiive solution. I might have used too many java specific functions.
 *
 * Always check your edge cases! Didn't consider an empty string.
 *
 * Solution only beat 17% of submissions, doing a bit better...
 *
 * Second solution beat 59.65% of submissions, looking at discussion for insight
 *
 * I'm going to leave this solution is as; most of the discussion solutions (faster performing)
 * used built in java functions to find substring; I don't think that is the point of this 
 * exercise.
 *
 * I like my second solution; I can implement it easily in C/C++ if I need to.
 */

package leetcode;

class Solution
{
	public static void main(String[] args){
		String h = args[0];
		String n = args[1];
		System.out.println("This is the result: " + strStr(h,n));
		System.out.println("This is the result using strStr2: " + strStr2(h, n));
	}
	
	public static int strStr(String haystack, String needle){
		if(haystack.length() == needle.length()){
			if(haystack.compareTo(needle) == 0){
				return 0;
			}else{
				return -1;
			}
		}
		if(needle.length() > haystack.length()){
			return -1;
		}
		StringBuilder str;
		for(int i = 0; 	i <= (haystack.length() - needle.length()); i++){
			str = new StringBuilder();
			for(int j = 0; j < needle.length(); j++){
				str.append(haystack.charAt(i+j));
			}
			System.out.println("Snippet: " + str.toString());
			if(needle.compareTo(str.toString()) == 0){
				return i;
			}
		}
		return -1;
	}

	public static int strStr2(String haystack, String needle){
		if(needle.length() == 0){
			return 0;
		}
		if(haystack.length() == needle.length()){
			if(haystack.compareTo(needle) == 0){
				return 0;
			}else{
				return -1;
			}
		}
		if(needle.length() > haystack.length()){
			return -1;
		}
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < haystack.length(); i++){
			str.append(haystack.charAt(i));
			if(str.length() > needle.length()){
				str.deleteCharAt(0);
			}
			if(needle.compareTo(str.toString()) == 0){
				/* adding 1 to offset index starting at 0 */
				return i + 1 - needle.length();
			}
		}
		return -1;
	}

}
