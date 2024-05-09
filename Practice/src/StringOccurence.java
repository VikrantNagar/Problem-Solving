import java.util.Scanner;

public class StringOccurence {
	
	public static int strStr(String haystack, String needle) {
        int len1 = haystack.length();
        int len2 = needle.length();

        for(int i=0 ; i<len1-len2+1 ; i++){
            if(haystack.substring(i, i+len2).equals(needle)) {
            	return i;
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String haystack = s.next();
		String needle = s.next();
		
		System.out.print(strStr(haystack, needle));
		s.close();
	}

}
