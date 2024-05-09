import java.util.Scanner;

public class StringCompression {
	
	public static void stringCompress(String str) {
		
		int len = str.length();
		
		for(int i=0 ; i<len ; i++) {
			
			int count = 1;
			
			while(i<len-1 && str.charAt(i) == str.charAt(i+1)) {
				count++;
				i++;
			}
			
			if(count == 1) {
				System.out.print(str.charAt(i));
				
			}
				
			else {
				System.out.print(str.charAt(i) + String.valueOf(count));
			}
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		
		stringCompress(str);

	}

}
