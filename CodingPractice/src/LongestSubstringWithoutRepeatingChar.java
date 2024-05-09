import java.util.Scanner;

public class LongestSubstringWithoutRepeatingChar {
	
	public static int LongestSubstring(String str) {
		
		int len = str.length();
//		int max = Integer.MIN_VALUE;
		int count = 0;
		for(int i=0 ; i<len ; i++) {
			boolean[] visited = new boolean[256];
			for(int k=i ; k<len ; k++) {
				if (visited[str.charAt(k)] == true) {
					break;
				}
				else {
					count = Math.max(count, k-i+1);
					visited[str.charAt(k)] = true;
				}
			}
			visited[str.charAt(i)] = false;
		}

		
		return count;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		//abcdabcab
		
		int len = LongestSubstring(str);
        System.out.println("The length of the longest "
                           + "non-repeating character "
                           + "substring is " + len);

	}

}
