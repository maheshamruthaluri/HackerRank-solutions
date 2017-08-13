import java.util.Scanner;

public class Pangrams {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		String s1 = s.replaceAll(" ","");
		String copy = s1.toLowerCase();
		boolean[] isItThere = new boolean[Character.MAX_VALUE];
		for(int i=0; i<copy.length(); i++){
			isItThere[copy.charAt(i)] = true;
		}
		int count = 0;
		for(int i=0; i<isItThere.length; i++){
			if(isItThere[i] == true){
				count++;
			}
		}
		//System.out.println(count);
		if(count == 26){
			System.out.println("pangram");
		}else{
			System.out.println("not pangram");
		}
	}
}
