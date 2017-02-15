import java.util.Scanner;


public class HackerRank2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double mealCost = sc.nextDouble();
		int tipPercent = sc.nextInt();
		int taxPercent = sc.nextInt();
		sc.close();
		
		double tip = mealCost * tipPercent/100;
		double tax = mealCost * taxPercent/100;
		
		double total = mealCost + tip + tax;
		
		int totalCost = (int)Math.round(total);
		System.out.println("The total meal cost is " +totalCost+ " dollars");
		
		
	}

}
