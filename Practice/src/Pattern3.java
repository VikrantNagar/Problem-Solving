import java.util.Scanner;

public class Pattern3 {

	public static void gameOfAlphabet(int n) {
        // Write your code here
        int i = 1;
        while(i<=n)
        {
            int j=1;
            while(j<=i){
                System.out.print((char)('A'+j-1)+ " ");
                j= j+1;
            }
            System.out.println();
            i = i+1;
        }
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        gameOfAlphabet(N);

    }
	
}
