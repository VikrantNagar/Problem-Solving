
public class StringQuest2 {
	
	public static void pallindrom(String str) {
		
		int len = str.length();
		int i = 0;
		int j = len-1;
		int k = 0;
		while(k <=len/2) {
			if(str.charAt(i) == str.charAt(j)) {
				i++;
				j--;
				k--;
			}
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Madam";
		
		pallindrom(str);

	}

}
