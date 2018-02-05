package solution;

class Solution{

	public static void main(String[] args){
		System.out.println("The coordinates go back to a circle: " + judgeCircle(args[0]));
	}

	public static boolean judgeCircle(String moves){
		/* axis: left is -x, right is +x, up is +y, down is -y, center is [0,0] */
		int[] coordinates = new int[2];
		coordinates[0] = 0; /* x */
		coordinates[1] = 0; /* y */
		for(int i = 0; i < moves.length(); i++){
			switch(moves.charAt(i)){

				case 'U':
					coordinates[1] += 1;
					break;
				case 'D':
					coordinates[1] -= 1;
					break;
				case 'L':
					coordinates[0] -= 1;
					break;
				case 'R':
					coordinates[0] += 1;
					break;
				default:
					break;

			}
		}

		if(coordinates[0] == 0 && coordinates[1] == 0){
			return true;
		}
		return false;
	}
}
