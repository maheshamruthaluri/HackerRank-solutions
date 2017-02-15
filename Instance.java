import java.io.*;
import java.util.*;

public class HackerRank4 {
	private int age;

	//make sure initialAge is positive
	public HackerRank4(int initialAge){
		if(initialAge >= 0){
		age = initialAge;
		}else{
			initialAge = 0;
			System.out.println("Age is not valid, setting age to 0.");
		}
	}
	
	//checking if the person is young, teenager or old
	public void amIOld(){
		if(age < 13){
			System.out.println("You are young.");
		}else if(age >= 13 && age < 18){
			System.out.println("You are a teenager.");
		}else{
			System.out.println("You are old.");
		}		
	}
	//increment age by +1
	public void yearPasses(){
		age = age + 1;
		//System.out.println(age);
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++){
			int age = sc.nextInt();
			HackerRank4  p = new HackerRank4(age);
			p.amIOld();
			for(int j = 0; j < 3; j++){
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();
	}

}
