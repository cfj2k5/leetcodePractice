/*
Given a roman numeral, convert it to an integer.
Input is guaranteed to be within the range from 1 to 3999.
*/

package leetcode;

class Solution{

	public static void main(String[] args){
		/* String roman = "MMCCCXCIX"; */
		String roman = "MMMDLXXXVI";
		System.out.println("The result of " + roman + " is: " + romanToInt(roman));
	}

	public static int romanToInt(String s){
		if(s == null){
			return -1;
		}
		int total = 0;
		/* making sure they are all capital letters */
		s = s.toUpperCase();
		for(int i = 0; i < s.length(); i++){
			switch(s.charAt(i)){
				case 'I':
					if(i < s.length()-1){
						if( s.charAt(i+1) == 'V'){
							total += 4;
							i++;
							break;
						}
						if(s.charAt(i+1) == 'X'){
							total += 9;
							i++;
							break;
						}
					}
					total += 1;
					break;
				case 'V':
					total += 5;
					break;
				case 'X':
					if( i < s.length()-1){
					       if( s.charAt(i+1) == 'L'){
							total += 40;
							i++;
							break;
					       }
					       if(s.charAt(i+1) == 'C'){
						total += 90;
						i++;
						break;
					       }
					}
					
					total += 10;
					break;
				case 'L':
					total += 50;
					break;
				case 'C':
					if(i < s.length()-1){
					       if(s.charAt(i+1) == 'D'){
							total += 400;
							i++;
							break;
						}
						if(s.charAt(i+1) == 'M'){
							total += 900;
							i++;
							break;
						}
					}
					total += 100;
					break;
				case 'D':
					total += 500;
					break;
				case 'M':
					total += 1000;
					break;
				default:
					break;
			}
		}
		return total;
	}

}
