import java.util.Scanner;

public class NearestPallindromOfNumber {
	public static int nearestPallindrom(int n) {
		String [] arr = String.valueOf(n).split("");
		int mid = arr.length/2;
		if(mid>6) {
			n = n+1;
		}
		return mid;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
		int n = s.nextInt();
		s.close();
		System.out.println(nearestPallindrom(n));
		

	}

}
