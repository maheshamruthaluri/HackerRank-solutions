import java.util.*;
import java.io.*;

public class HackerRank8 {
	
	public static  void main(String[] args){
		
		Map<String , Integer> phoneBook = new HashMap<String, Integer>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i = 0; i <n; i++){
			String name = in.next();
			int phone = in.nextInt();
			
			//Entering into the phonebook
			phoneBook.put(name, phone);
			
			//Displaying Keys and values from the phoneBook
			//System.out.println(phoneBook.toString().replace("{", "").replace("="," ").replace("}",""));
		}
		
		while(in.hasNext()){
			String s = in.next();
			//Write Code here
			if(phoneBook.containsKey(s) == true){
				System.out.println(s + "=" +phoneBook.get(s));
			}else{
				System.out.println("not found");
			}
			
		}
		in.close();
	}
}
