import java.util.Scanner;

public class MergeStringAlternatively {
	
	public static String mergeAlternately(String word1, String word2) {
        
        int lenWord1 = word1.length();
        int lenWord2 = word2.length();
        int maxLen = 0;
        String str = "";
        if(lenWord1 >= lenWord2){
            maxLen = lenWord1;
        }
        else{
            maxLen = lenWord2;
        }
        for(int i=0; i<maxLen ; i++){
            if(i < lenWord1 && i<lenWord2) {
            	str = str + word1.charAt(i) + word2.charAt(i);
            }
            else if(i>=lenWord1) {
            	str = str + word2.charAt(i);
            }
            else {
            	str = str + word1.charAt(i);	
            }
           
        }
      
        
        return str;

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String word1 = s.next();
		String word2 = s.next();
		
		String str = mergeAlternately(word1, word2);
		System.out.println(str);
		

	}

}
