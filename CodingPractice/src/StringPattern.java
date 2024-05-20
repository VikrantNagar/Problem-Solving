import java.util.Scanner;

public class StringPattern {
	
	public static void convertString(String str) {
		
		int len = str.length();
		int count = 0;
		String newStr = "";
		
		for(int i=0 ; i<len ; i++) {
			if(str.charAt(i) == 'a') {
				count++;
				int t = count;
				while(t>0) {
					newStr = newStr + '@';
					t--;
				}
			}else {
				newStr = newStr +  str.charAt(i);
			}
		}
		
		int newLength = newStr.length();
		
		for(int i=0 ; i<newLength ; i++) {
			System.out.print(newStr.charAt(i));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		convertString(str);
		
		s.close();
		
		//Question Input String : java application
		//output String : j@v@@ @@@plic@@@@tion
		
	}

}
