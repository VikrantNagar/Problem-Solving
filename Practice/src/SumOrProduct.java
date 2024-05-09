import java.util.Scanner;
public class SumOrProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int choice = s.nextInt();
		if(choice==1) {
			int sum = 0;
			for(int i=1;i<=n; i++) {
				 sum = sum+i;
			
			}
			System.out.print(sum);
		}else if(choice==2) {
			int prod = 1;
			for(int j =1;j<=n;j++) {
				prod = prod*j;
			}
			System.out.print(prod);
		}else {
			System.out.print(-1);
		}

	}

}
