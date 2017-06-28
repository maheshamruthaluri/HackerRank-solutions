import java.util.Scanner;

public class PlusMinus {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float pos = 0;
        float neg = 0;
        float zero = 0;
        float resultPos = 0;
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            
            if(arr[arr_i] > 0){
            	pos++;
            }
            if(arr[arr_i] < 0){
            	neg++;
            }
            if(arr[arr_i] == 0){
            	zero++;
            }
            
        }
        System.out.println(pos/n+"\n"+neg/n+"\n"+zero/n);
    }

}
