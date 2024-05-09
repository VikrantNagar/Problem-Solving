import java.util.Scanner;

public class LongestSubString {
	
	public static void longestPallindromSubstr(String str) {
		
		int max = Integer.MIN_VALUE;
		int l = str.length();
		String str1 = null;
		
		for(int i=0 ; i<l ; i++) {
			for(int k=l ; k>i ; k--) {
				
				boolean result = Pallindrom(str.substring(i,k));
				
				if(result && str.substring(i,k).length()>1) {
//					System.out.println(str.substring(i,k));
					int len1 = str.substring(i,k).length();
					if(len1>max) {
						max = len1;
						str1 = str.substring(i,k);
					}
				}
			}
		}
		System.out.println(str1 + " " + max);
		
	}
	
	public static boolean Pallindrom(String str) {
		
		int len = str.length();
		int i=0;
		int j=len-1;
		int k = 1;
		while(k<=len/2) {
			if(str.charAt(i)== str.charAt(j)) {
				i++;
				j--;
				k++;
			}
			else {
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String word = s.next();
//		System.out.print(Pallindrom(word));
		
		longestPallindromSubstr(word);

	}

}
