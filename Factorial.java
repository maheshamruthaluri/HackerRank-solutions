import java.util.Scanner;


public class HackerRank9 {
	
	public static int Factorial(int n){
		//Base Case
		if(n <= 1){
			return 1;
		}
		// Recursive Case
		else{
			return n * Factorial(n - 1);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		System.out.println(Factorial(m));
		
	
	}

}
