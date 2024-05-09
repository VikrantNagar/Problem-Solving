import java.util.Scanner;

public class RemoveCharacter {
	
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		// Your code goes here
		String str1 = "";
		for(int i=0 ; i<str.length() ; i++) {
			if(str.charAt(i)!=ch) {
				str1 = str1 + str.charAt(i);
			}
		}
		
		return str1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner s = new Scanner(System.in);
				String str = s.nextLine();
				char ch = s.next().charAt(0);
				System.out.print(removeAllOccurrencesOfChar(str,ch));

	}

}
