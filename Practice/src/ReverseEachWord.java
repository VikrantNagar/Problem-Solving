import java.util.Scanner;

public class ReverseEachWord {
	
	public static void ReverseString(String str) {
		
		String word[] = str.split(" ");
		for(int j=0; j<word.length; j++) {
			String w = word[j];
		
		for(int i=w.length()-1;  i>=0 ; i--) {
			
			System.out.print(w.charAt(i));
		}
		System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		ReverseString(str);

	}

}


// Using String Buffer

//public static String reverseEachWord(String str) {
//	//Your code goes here
//	StringBuilder str1 = new StringBuilder();
//	String word[] = str.split(" ");
//	for(int j=0; j<word.length; j++) {
//		String w = word[j];
//	
//	for(int i=w.length()-1;  i>=0 ; i--) {
//		
//		str1.append(w.charAt(i));
//	}
//	str1.append(" ");
//	}
//	return str1.toString();
//}

