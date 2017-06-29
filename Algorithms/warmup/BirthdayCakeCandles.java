import java.util.Scanner;

public class BirthdayCakeCandles {
	//int count = 0;
	
	static int birthdayCandles(int n, int[] ar){
		int count = 0;
		int currentMax = ar[0];
		for(int i=0; i<n; i++){
			if(ar[i] > currentMax){
				currentMax = ar[i];
				//count = 0;
			}
			if(ar[i] == currentMax){
				count++;
			}
		}
		return count;
		
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for(int i=0; i<n; i++){
			ar[i] = in.nextInt();
		}
		int result = birthdayCandles(n,ar);
		System.out.println(result);
	
	}

}
