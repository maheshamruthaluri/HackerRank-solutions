import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        long sum = 0;
        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        for(int i=0; i<5; i++){
        	for(int j=0; j<5; j++){
        		if(j!=i){
        			sum += arr[j];
        		}
        		
        	}
        	if(max < sum){
        		max = sum;
            	//System.out.println(sum);
        	}
        	if(min > sum){
        		min = sum;
        	}
        	sum = 0;
        }
    	System.out.println(min+" "+max);
    }

}
