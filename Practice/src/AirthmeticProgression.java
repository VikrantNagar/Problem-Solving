import java.util.Scanner;
public class AirthmeticProgression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int series = 1;
		int j=1;
		for(int i=1 ;i<=x ;)
		{
			
			series = (3*j)+2;
			if(series%4!=0)
			{
				System.out.print(series + " ");
				i++;
			}
			j = j+1;
		}

	}

}
