import java.util.Scanner;

public class StringUnCompress {
	
	public static void decompress(String str) {
		
		int len = str.length();
		int num = 0;
		for(int i=0 ; i<len ; i++) {
		
			if(Character.isDigit(str.charAt(i))) {
				
				num = Character.getNumericValue(str.charAt(i));
				
				for(int j=1 ; j<num ;j++) {
					System.out.print(str.charAt(i+1));
				}
			}
			else {
				
				System.out.print(str.charAt(i));
			}
			
			num = 0;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		decompress(str);

	}

}
