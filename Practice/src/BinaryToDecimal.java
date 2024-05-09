import java.util.Scanner;
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int decimal = 0;
		long remainder;
		
		for(int i=0;n!=0;)
		{
			 remainder = n % 10;
			 System.out.println(remainder);
		      n /= 10;
		      System.out.println(n);
		      decimal += remainder * Math.pow(2, i);
		      ++i;
		}System.out.print(decimal);

	}}
