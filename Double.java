import java.util.*;


public class HackerRank1 {
	public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
         
		
        int myInt = scan.nextInt();
        double myDouble = scan.nextDouble();
        scan.nextLine();
        String myString = scan.nextLine();
        
        

        System.out.println(i + myInt);
        System.out.println(d + myDouble);
        System.out.println(s + myString);
		
		
		
        scan.close();
     }
 }
