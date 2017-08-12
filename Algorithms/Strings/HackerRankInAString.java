import java.util.Scanner;
import java.lang.*;

public class HackerRankInAString {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		char[] compare = "hackerrank".toCharArray();
		int length = compare.length;
		for(int a0=0; a0<q; a0++){
			String s = in.next();
			int len = s.length();
			int i=0, j=0;
			int count = 0;
			while(i < len && j < length){
				if(s.charAt(i) == compare[j]){
					j++;
					count++;
				}
				i++;
			}
			if(count == length){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}
