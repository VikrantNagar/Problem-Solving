import java.util.Scanner;

public class CompressTheString {

	public static String removeConsecutiveDuplicates(String str) {
		//Your code goes here
		int j = 0, i=0;
		String str2 = "";
		int count = 0;
		while(i<str.length()) {
			if(str.charAt(i)==str.charAt(j)) {
				count++;
				i++;
			}
			else if (str.charAt(i) != str.charAt(j)|| i == str.length() - 1) {
				if(count>1) {
			        str2 += str.charAt(j)+String.valueOf(count);
			        count = 1;
			        j = i;
			        i++;
				}else {
					str2 += str.charAt(j);
			        j = i;
			        i++;
				}
			}
			
		}
		if(count>1) {
		str2 += str.charAt(i - 1)+String.valueOf(count);
		//return str2;
		}
		else {
			str2 += str.charAt(i - 1);
			}
		return str2;
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		System.out.print(removeConsecutiveDuplicates(str));
		

	}

}
