import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		float basicSalary = sc.nextFloat();
		String s = sc.nextLine();
		char grade = s.charAt(1);
		float hra = (basicSalary * 20)/100;
		float da = (basicSalary * 50) / 100;
		float pf = (basicSalary * 11) / 100;
		float allow = 0.0f;
		if(grade=='A')
		{
			allow = 1700;
		}else if(grade == 'B'){
			allow=1500;
		}else{
			allow = 1300;
		}
		int totalSalary = (int) Math.round(basicSalary + hra + da + allow-pf);
		System.out.println(totalSalary);


	}
}
