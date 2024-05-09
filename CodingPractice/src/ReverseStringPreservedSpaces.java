
public class ReverseStringPreservedSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "My name is vikrant";
		int len = str1.length();
		char[] str = str1.toCharArray();
		int start = 0;
		int end = len-1;
		
		while(start<end){
		
			if(str[start] == ' ') {
				start ++;
				continue;
			}
			else if(str[end] == ' ') {
				end--;
				continue;
			}
			else {
				char temp = str[start];
				str[start] = str[end];
				str[end] = temp;
				start++;
				end--;
			}
		}
		System.out.print(String.valueOf(str));
	}

}
