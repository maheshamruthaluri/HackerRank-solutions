import java.util.Scanner;

public class DivisibleSumPairs {
	
	static int divisibleSumPairs(int n, int k, int[] ar){
		//int i = 0, j = 0;
		int count = 0;
		for(int i=0; i<n; i++){
			for(int j=i+1; j<n; j++){
				if((ar[i]+ar[j]) % k == 0){
					count++;
				}
			}
		}
		return count;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] ar = new int[n];
		for(int ar_i=0; ar_i<n; ar_i++){
			ar[ar_i] = sc.nextInt();
		}
		
		int result = divisibleSumPairs(n, k, ar);
		System.out.println(result);
	}
}
