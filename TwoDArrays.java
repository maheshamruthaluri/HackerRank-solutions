import java.util.Scanner;

public class HackerRank11 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int arr[][] = new int [4][4];
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				arr[i][j] = in.nextInt();
			}
		}
		
		//To get the sum of hourglass elements
		int sum = 0;
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 4; j++){
				if(i + 2 < 4 && j + 2 < 4){
				sum =sum + (arr[i][j] + arr[i][j + 1] +arr[i][j + 2]);
				sum = sum + (arr[i + 1][j + 1]);
				sum = sum + (arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j +2]);
				if(max < sum){
					max = sum;
				}
				sum = 0;
				}
				
			}
		}
		
		System.out.println(max);
	}

}
