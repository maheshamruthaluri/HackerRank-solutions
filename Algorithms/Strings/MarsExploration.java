import java.util.Scanner;

public class MarsExploration {
	
	/*
	 * Input 0
	 * SOSSPSSQSSOR
	 * Output 0
	 * 3
	 * 
	 * Input 1
	 * SOSSOT
	 * Output 1
	 * 1
	 * 
	 * */
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String compare = "SOS";
		String s = in.next();//length is a multiple of 3
		int size = s.length();
		int count = 0;
		char p = 'P';
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) != compare.charAt(i%3)){
				count ++;
			}
			}
		
		System.out.println(count);
		
	}

}
