import java.util.Scanner;


public class HackerRank5 {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 1; i <= 10; i++){
			int a = n * i;
			System.out.println(n+ " x " +i+ " = "+a);
		}
	}

}
