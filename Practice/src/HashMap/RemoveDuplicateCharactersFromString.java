package HashMap;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharactersFromString {
	
	public static void removeDuplicates(String str) {
		int n = str.length();
		HashMap<Character, Integer> map = new HashMap<>();
		for(int i=0; i<n ; i++) {
			if(map.containsKey(str.charAt(i))) {
				int count = map.get(str.charAt(i));
				count++;
				map.put(str.charAt(i), count);
			}else
			{
				map.put(str.charAt(i), 1);
			}
		}
		Set<Character> set = map.keySet();
		for(char s: set) {
			System.out.print(s);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		s.close();
		removeDuplicates(str);
		

	}

}
