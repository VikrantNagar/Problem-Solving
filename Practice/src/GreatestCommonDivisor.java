import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int X = s.nextInt();
		int Y = s.nextInt();
		int gcd =1;
		for(int i=1 ; i<=X && i<=Y; i++) {
			if(X%i==0 && Y%i==0) {
				gcd =i;
			}
		}System.out.print(gcd);

	}

}
