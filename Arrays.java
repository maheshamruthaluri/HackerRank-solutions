import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class HackerRank7 {
	
	public static void main(String[] args){
		HackerRank7 hr = new HackerRank7();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = sc.nextInt();
		}
		for(int i =(arr.length - 1); i >= 0; i--){
			System.out.print(arr[i]+ " ");
		}
	}
	
}
