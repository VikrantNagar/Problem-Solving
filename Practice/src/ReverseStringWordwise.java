import java.util.Scanner;

public class ReverseStringWordwise {
	
	public static String ReverseString(String str) {
		
		String word[] = str.split(" ");
		String str1 = "";
		for(int i=word.length-1;  i>=0 ; i--) {
			 str = word[i];
			str1 = str1+str + " ";
			
			
		}
		return str1;

		//System.out.print(str1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.print(ReverseString(str));

	}

}
