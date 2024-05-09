import java.util.Scanner;

public class SingleDigitSum {
	
	public static int singleDigit(int n) {
		
		int sum = 0;
		 
        // Loop to do sum while
        // sum is not less than
        // or equal to 9
        while (n > 0 || sum > 9)
        {
            if (n == 0) {
                n = sum;
                sum = 0;
            }
            sum += n % 10;
//            System.out.println(sum);
            n /= 10;
//            System.out.println(n);
        }
        return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		System.out.println(singleDigit(n));

	}

}
