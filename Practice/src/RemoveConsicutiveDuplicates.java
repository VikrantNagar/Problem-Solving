import java.util.Scanner;

public class RemoveConsicutiveDuplicates {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		int j = 0, i=0;
		String str2 = "";
		while(i<str.length()) {
			if(str.charAt(i)==str.charAt(j)) {
				i++;
			}
			else if (str.charAt(i) != str.charAt(j)|| i == str.length() - 1) {
			        str2 += str.charAt(j);
			        j = i;
			        i++;
				}
			
		}
		str2 += str.charAt(i - 1);
		return str2;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.print(removeConsecutiveDuplicates(str));
		

	}

}
