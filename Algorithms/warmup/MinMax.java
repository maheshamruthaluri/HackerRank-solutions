import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for(int i=0; i<5; i++){
        	for(int j=0; j<5; j++){
        		if(j!=i){
        			sum += arr[j];
        		}
        		
        	}
        	System.out.println(sum);
        	sum = 0;
        }
    }

}
