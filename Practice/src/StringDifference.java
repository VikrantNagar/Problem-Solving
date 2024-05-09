import java.util.Scanner;

public class StringDifference {
	
public static char findTheDifference(String s, String t) {
	
//	int len1 = s.length();
//	int len2 = t.length();

//	int str1Count = 0;
//	int str2Count = 0;
//	if(len1 ==0) {
//		return t.charAt(len2-1);
//	}
////    for(int i=0 ; i<len2 ; i++) {
//    	for(int j=0; j<len1 ; j++)
//    	if(t.charAt(i) == s.charAt(j)) {
//    		count ++;
//    	}if(count ==0) {
//    		return t.charAt(i);
//    	}
//    	
//    	count = 0;
//    }
//    return t.charAt(len2-1);
	
	char c = 0;
    for (char ch: s.toCharArray()) {
        c ^= ch;
    }
    for (char ch: t.toCharArray()) {
        c ^= ch;
    }
    return c;
	
    
    
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String str1 = s.nextLine();
		s.close();
		char ch = findTheDifference(str, str1);
		System.out.println(ch);
	}

}
