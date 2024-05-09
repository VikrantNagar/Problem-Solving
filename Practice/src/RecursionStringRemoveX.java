import java.util.Scanner;

public class RecursionStringRemoveX {
	
	public static String removeX(String input){
		// Write your code here

		if(input.length() == 0){
			return input;
		}
		String smallOutput = removeX(input.substring(1));
		if(input.charAt(0) == 'x'){
			return smallOutput;
		}
		else{
			return input.charAt(0 )+ smallOutput;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.print(removeX(str));
		
	}

}
