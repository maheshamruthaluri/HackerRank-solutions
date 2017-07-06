import java.util.Scanner;

public class DayOfProgrammer {
	
	static String solve(int year){
		int day = 13;
		String dayOfProgrammer = "";
		if((year >= 1919 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) || (year <= 1917 && year % 4 == 0)){
			day -= 1;
			dayOfProgrammer = +day+".09."+year;
		}else if(year == 1918){
			dayOfProgrammer = "26.09.1918";
		}else{
			dayOfProgrammer = +day+".09."+year;
		}
		return dayOfProgrammer;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }

}
