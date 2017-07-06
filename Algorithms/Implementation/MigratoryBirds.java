import java.util.Arrays;
import java.util.Scanner;

public class MigratoryBirds {
	static int migratoryBirds(int n, int[] ar) {
        // Complete this function
		Arrays.sort(ar);
		int currentCount = 1;
		int highestCount = 0;
		int currentBird = ar[0];
		int mostFrequent = ar[0];
		
		for(int i=0; i<n-1; i++){
			currentBird = ar[i];
			if(ar[i] == ar[i+1]){
				currentCount++;
				if(currentCount > highestCount){
					highestCount = currentCount;
					mostFrequent = currentBird;
				}
			}else{
				currentCount = 1;
			}
		}
		return mostFrequent;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
