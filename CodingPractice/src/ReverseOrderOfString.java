import java.util.Scanner;

public class ReverseOrderOfString {
	
	public static void reverseOrder(String word) {
		
		String str [] = word.split(" ");
		for(int i=str.length-1 ; i>=0 ; i--) {
			System.out.print(str[i] + " ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String word = s.nextLine();
		
		reverseOrder(word);
	}

}
