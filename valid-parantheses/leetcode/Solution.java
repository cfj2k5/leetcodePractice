
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
package leetcode;

class Solution{

	public static void main(String[] args){
		System.out.println("The string " + args[0] + " is valid: " + isValid(args[0]));	
	}

	public static boolean isValid(String s){
       /* array to hold an accounting of brackets */
        /* in this order: ( ), { }, [ ] */
        int[] counter = {0, 0, 0};
        for(int i = 0; i < s.length(); i++){
            switch(s.charAt(i)){
                case '(':
                    counter[0] += 1;
                    break;
                case ')':
                    if(counter[0] == 0){
                         /* edge case, already know string is unpaired */
                        return false;
		    }
				
		    if(i > 0){
			    /* edge case that was given, brackets must close in order */
			if(s.charAt(i-1) != '('){
				return false;
			}
		    }
                    counter[0] -= 1;
                    break;
                case '{':
                    counter[1] += 1;
                    break;
                case '}':
                    if(counter[1] == 0){
                        /* edge case, already know this is unpaired */
                        return false;
                    }
		    if(i > 0){
			/* edge case where they must close in order */
			    if(s.charAt(i-1) != '{'){
				return false;
			    }
		    }
                    counter[1] -= 1;
                    break;
                case '[':
                    counter[2] += 1;
                    break;
                case ']':
                    if(counter[2] == 0){
                        /* edge case, already know this is unpaired */
                        return false;
                    }
		    if(i > 0){
			/* edge case where the must close in order */
			    if(s.charAt(i-1) != '['){
				return false;
			    }
		    }
                    counter[2] -= 1;
                    break;
                default:
                    break;
            }/* end switch */
        }/* end if */
        /* check to see if we have any brackets unaccounted for */
        for(int i = 0; i < 3; i++){
            if(counter[i] != 0){
                return false;
            }
        }
        return true;

	}


}
