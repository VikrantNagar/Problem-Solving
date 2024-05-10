import java.util.Scanner;

public class LongestCommonPrefix {
	
	    public static String longestCommonPrefix(String[] strs) {

	    if(strs.length == 0) {
	        return "";
	    }   

	    String shortest = strs[0];
	    for(String str : strs){
	        if(str.length()<shortest.length()){
	            shortest = str;
	        }
	    }

	    for(String str : strs){
	    for(int i=0 ; i<shortest.length() ; i++){
	            if(str.charAt(i)!=shortest.charAt(i)){
	                return shortest.substring(0,i);
	            }
	        }
	    }
	    
	    return shortest;
	    
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		
		int len  = s.nextInt();
		String str[] = new String[len];
		
		for(int i=0; i<len ; i++) {
			str[i] = s.next();
		}
		
		String commonPrefix = longestCommonPrefix(str);
		
		System.out.print(commonPrefix);
		
		
		
	}

}
