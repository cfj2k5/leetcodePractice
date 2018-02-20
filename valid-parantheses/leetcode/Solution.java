
/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
*/


/*
 * I don't think I understood the question correctly because the test case "[()]" fails my test, passes theirs. The
 * question is not very specific about ordering... was the previous opening bracket supposed to be the opening to the 
 * kind of bracket? Does it have to be an openning bracket? I'll look into this a bit more later. Got to work now.
 *
 */

/* Re-read the question and adjusted my assumptions.
 *
 * This solution works. It aligns with many in the discussion, but I could have simplified it a bit.
 *
 */
package leetcode;

import java.util.*;

class Solution{

	public static void main(String[] args){
		System.out.println("The string " + args[0] + " isValid(): " + isValid(args[0]));	
		System.out.println("The string " + args[0] + " isValid2(): " + isValid2(args[0]));	
	}

	public static boolean isValid(String s){
        /* array to hold an accounting of brackets */
        /* in this order: ( ), { }, [ ] */
        LinkedList<Character> fifo = new LinkedList<Character>();
        
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case '(':
                    fifo.push('(');
                    break;
                case ')':
                    if(fifo.size() == 0){
                         /* edge case, already know string is unpaired */
                        return false;
		            }
                    if(fifo.peek() != '('){
                        /* edge case, not closed in order */
                        return false;
                    }
                    fifo.pop(); /* pop the ( */
                    break;
                case '{':
                    fifo.push('{');
                    break;
                case '}':
                    if(fifo.size() == 0){
                         /* edge case, already know string is unpaired */
                        return false;
		            }
                    if(fifo.peek() != '{'){
                        /* edge case, not closed in order */
                        return false;
                    }
                    fifo.pop(); /* pop the { */
                    break;
                case '[':
                    fifo.push('[');
                    break;
                case ']':
                    if(fifo.size() == 0){
                         /* edge case, already know string is unpaired */
                        return false;
		            }
                    if(fifo.peek() != '['){
                        /* edge case, not closed in order */
                        return false;
                    }
                    fifo.pop(); /* pop the [ */
                    break;
                default:
                    break;
            }/* end switch */
        }/* end if */
        
        /* check to see if we have any brackets unaccounted for */
        if(fifo.size() != 0){
            return false;
        }
        return true;
	}
	public static boolean isValid2(String s){
		LinkedList<Character> fifo = new LinkedList<Character>();
		for(char c : s.toCharArray()){
			switch(c){
				/* similar to the above solution, we push a matching paranthesis
				 * but here, we push its opposite then check if the order is correct
				 * and pop it when it is encountered. Saves a few operations and
				 * we check mulitple edge cases at once.
				 */
				case '{':
					fifo.push('}');
					break;
				case '(':
					fifo.push(')');
					break;
				case '[':
					fifo.push(']');
					break;
				default:
					if((fifo.size() == 0) || (fifo.pop() != c)){
						return false;
					}
				break;
			}
		}
		
		return fifo.isEmpty();
	}/* isEmpty2 */
}
