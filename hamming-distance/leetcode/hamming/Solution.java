package leetcode.hamming;

public class Solution {
	public static void main(String[] args){
		int x = 1;
		int y = 4;
		System.out.println("Hamming distance of x and y: " + hammingDistance(x,y));
	}
    
	public static int hammingDistance(int x, int y) {
        int count = 0;
        for(int i = 0; i < 32; i++){
            if(((x >> i) & 0x01) != ((y >> i) & 0x01)){
                count++;
            }
        }
        return count;
    }
}
