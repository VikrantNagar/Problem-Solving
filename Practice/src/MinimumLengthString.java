import java.util.Scanner;

public class MinimumLengthString {
	
	public static void minLengthWord(String input){
	
		String[] word = input.split(" ");
		int min = Integer.MAX_VALUE;
		String s = null;
		for(int i=0; i<word.length ; i++) {
			
			if(word[i].length()<min) {
				min = word[i].length();
				s = word[i];
				
			}
		}
		System.out.println(s);
	
	
		//return input;
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		minLengthWord(str);
		

	}

}
