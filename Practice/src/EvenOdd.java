import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int Evensum = 0;
		int Oddsum = 0;
		while(N>0)     //1234
		{
			int reminder = N%10;
			//System.out.println(reminder);
			if(reminder%2==0)
			{
				Evensum = Evensum+reminder;
			}else
			{
				Oddsum = Oddsum + reminder;
			}
			N = N/10;
		}
		System.out.print(Evensum+ " " + Oddsum);
		

	}

}
