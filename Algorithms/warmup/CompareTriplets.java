import java.util.Scanner;

public class CompareTriplets {
	
	public void solve(int a0, int a1, int a2, int b0, int b1, int b2){
		//Comparing using a ternary operator
		int Alice = ((a0 > b0) ? 1 :0) + ((a1>b1)?1:0) + ((a2>b2)? 1:0);
		int Bob = ((a0 < b0) ? 1 :0) + ((a1<b1)?1:0) + ((a2<b2)? 1:0);
		
		System.out.println(Alice+ " " +Bob);
		
		}  
	
	public static void main(String[] args) {
		CompareTriplets compare = new CompareTriplets();
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        compare.solve(a0, a1, a2, b0, b1, b2);
    }

}
