import java.util.Scanner;

public class DiagonalDifference {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[][] = new int[n][n];
		int lSum = 0;
		int rSum = 0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				arr[i][j] = in.nextInt();
				if(i == j){
					lSum += arr[i][j];
				}
				if(i == n-1-j){
					rSum += arr[i][j];
				}
			}
		}
		System.out.println(Math.abs(lSum-rSum));
		//System.out.println(rSum);
	}

}
