import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		for(int i=1; i<=N ; i++){
			for(int j=N; j>0+i ; j--) {
			System.out.print(j);
		}
			System.out.print("*");
			for(int k=i-1; k>0; k--) {
				System.out.print(k);
			}
			System.out.println();

	}

}
}
