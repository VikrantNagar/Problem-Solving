import java.util.Scanner;

public class BasicPattern {

	public static void gameOfPattern(int n) {
        // Write your code here
        int i = 1;
        while(i<=n)
        {
            int j=1;
            while(j<=n)
            {
                System.out.print("*");
                j = j+1;
            }
            System.out.println();
            i = i+1;
        }

        
    }
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        gameOfPattern(N);

    }

}
