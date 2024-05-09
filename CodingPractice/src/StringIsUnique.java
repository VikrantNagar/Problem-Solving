import java.util.Scanner;

public class StringIsUnique {
	
	public static boolean uniqueString(String str) {
		
		int n = str.length();
		for(int i=0 ; i<n ; i++) {
			for(int j=i+1; j<n;j++) {
				if(str.charAt(i)== str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.next();
		
		System.out.print(uniqueString(str));

	}

}
