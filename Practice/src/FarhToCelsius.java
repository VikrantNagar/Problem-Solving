import java.util.Scanner;

public class FarhToCelsius {
	
	
	public static void printFahrenheitTable(int start, int end, int step) {
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print the specified output in required format. 
		 * Taking input is handled automatically. 
		 */
		
		int convert  = 0;
		int celsius = 0;
		for(int i = start;i<=end;)
		{
			celsius = i+step-step;
			System.out.print(celsius + " ");
			convert = (5*(celsius-32))/9;
			System.out.println(convert);
			i = i+step;
		}
		
	}
	
	public static void main(String arge[])
	{
		//System.out.println("Enter start farhenit valuse(S):");
		Scanner sc = new Scanner(System.in);
		int Start = sc.nextInt();
		//System.out.println("Enter end farhenit valuse(E):")0;
		int End = sc.nextInt();
		//System.out.println("Enter step size(W):");
		int step = sc.nextInt();
		sc.close();
		printFahrenheitTable(Start, End, step);
		
	}

	}


