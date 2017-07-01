import java.util.Scanner;

public class BreakingRecords {
	
	static void getRecord(int[] s){
		int currentRecord = s[0];
		int bestRecord = 0;
		int worstRecord = 0;
		for(int i=0; i<s.length; i++){
			if(s[i] > currentRecord){
				currentRecord = s[i];
				bestRecord++;
			}
		}
		currentRecord = s[0];
		for(int j=0; j<s.length; j++){
			if(s[j] < currentRecord){
				currentRecord = s[j];
				worstRecord++;
			}
		}
		System.out.println(bestRecord+" "+worstRecord);
		
	}
	
	public static void main(String[] args) {
        
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        BreakingRecords.getRecord(s);
        //System.out.println(result);
        

}
}
