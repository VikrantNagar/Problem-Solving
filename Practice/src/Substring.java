import java.util.Scanner;

public class Substring {

	public static void printSubstrings(String str) {
		//Your code goes here
		for(int i=0 ; i<str.length() ;i++) {
			for(int j=i ; j<str.length(); j++) {
				
				System.out.println(str.substring(i,j+1));
			}
			//System.out.print(str);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		printSubstrings(str);
		


	}

}
