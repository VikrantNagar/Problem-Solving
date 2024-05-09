import java.util.Scanner;

public class StringPallindrom {
	
	public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s =s.toLowerCase();
        System.out.println(s);
        int n = s.length();
        int i=0;
        int j = n-1;
        while(i<=n/2){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		System.out.print(isPalindrome(str));

	}

}
