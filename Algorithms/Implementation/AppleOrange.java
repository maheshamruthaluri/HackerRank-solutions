import java.util.Scanner;

public class AppleOrange {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int countApple = 0;
        int countOrange = 0;
        int temp;
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        for(int i=0; i<m; i++){
        	
        	if(a + apple[i] >= s && a + apple[i] <= t){
        		countApple ++;
        	}
        }
        for(int j=0; j<n; j++){
        	
        	if(b + orange[j] <= t && b + orange[j] >= s){
        		countOrange++;
        	}
        }
        System.out.println(countApple);
        System.out.println(countOrange);
    }

}
