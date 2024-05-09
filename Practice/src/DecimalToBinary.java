import java.util.Scanner;

public class DecimalToBinary {

	public static long decToBinary(long N)
    {
        // Size of an integer is assumed to be 32 bits
		long ans = 0;
        int cnt = 0;
        while (N != 0) {
            long rem = N % 2;
            long c = (long) Math.pow(10, cnt);
            ans += rem * c;
            N /= 2;
            cnt++;
        }
 
        return ans;
    }
    

    public static void main(String[] args)
    {
       
    	Scanner s = new Scanner(System.in);
        long N = s.nextInt();
        decToBinary(N);
        System.out.print(decToBinary(N));
    }
}
