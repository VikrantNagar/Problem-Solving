import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        int i=x;
        if(n==0)
        {
            System.out.print(1);
        }else {
        while(n>1)
        {
            x=x*i;
            n=n-1;
        }
        System.out.print(x);
        
    }}
	}


