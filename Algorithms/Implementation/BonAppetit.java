import java.util.Scanner;

public class BonAppetit {
	public void bonAppetit(int n, int k, int b, int[] ar) {
		int annaShare = 0;
		int i= 0 ;
		int total = 0;
		for(i=0; i<n; i++){
			if(i != k){
				total += ar[i];
			}
		}
		annaShare = total/2;
		if(annaShare == b){
			System.out.println("Bon Appetit");
		}else{
			int extraCharged = b - annaShare;
			System.out.println(extraCharged);
		}
	}

    public static void main(String[] args) {
    	BonAppetit ba = new BonAppetit();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        ba.bonAppetit(n, k, b, ar);
    }
}
