import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Enter a name : ");
			Scanner sc = new Scanner(System.in);
			
			char c = sc.next().charAt(0);
			int mark1 = sc.nextInt();
			int mark2 = sc.nextInt();
			int mark3 = sc.nextInt();


			
			int average = (mark1 + mark2 + mark3)/3;
		System.out.println(c);
		System.out.println(average);	
			
	}

}
