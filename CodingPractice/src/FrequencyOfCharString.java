import java.util.Scanner;

public class FrequencyOfCharString {
	
	public static void frequencyOfGiverCharacter(String str, char ch) {
		
		int len  = str.length();
		int count = 0;
		for(int i=0 ; i<len ; i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.print(count);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char ch = s.next().charAt(0);
		
		frequencyOfGiverCharacter(str, ch);

	}

}
