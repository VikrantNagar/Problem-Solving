import java.util.Scanner;

public class FrequencyOfCharacterInString {
	
	public static int frequencyChar(String s) {
		
		int [] arr = new int[256];
//		for(int i=0 ;i<arr.length ;i++) {
//			arr[i] = 0;
//		}
		for(int j=0 ;j<s.length();j++) {
			arr[s.charAt(j)]++;
		}
		int max = 0;
		for(int k=0;k<arr.length;k++) {
			if(arr[k]>max) {
				max = arr[k];
			}
		}
		return max;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();
		int countOfString = frequencyChar(str);
		System.out.print(countOfString);
		
		

	}

}
