class Solution{
	public int numJewelsInStones(String J, String S){
		Map<Character, Integer> jewels = new HashMap<Character, Integer>;
		int count = 0;
		for(int i = 0; i < J.size; j++){
			jewels.put(J.charAt(i), 1);
		}
		for(i = 0; i < S.size; i++){
			if(jewels.containsKey(j.charAt(i))){
				count++;
			}
		}
		return count;
	}

}
