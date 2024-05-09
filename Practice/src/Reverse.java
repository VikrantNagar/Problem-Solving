import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
//		String n = s.next();
//		int len = n.length();
//		
//		for(int i=len-1 ;i>=0 ;i--)
//		{
//			if(n.charAt(i)-'0'!=0)
//			{
//			System.out.print(n.charAt(i));
//			}
//		}

//		int n = s.nextInt();
//		int r = 1;
//		for(int i=1;n!=0;i++)
//		{
//			r = n%10;
//			n = n/10;
//			if(r!=0) {
//			System.out.print(r);
//		}
//		}
//		
		int n = s.nextInt();
		int rev=0;
		while(n>0)
		{
			int i = n%10;
			rev=rev*10+i;
			n/=10;
		}
		System.out.print(rev);
	}

}
