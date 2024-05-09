import java.util.HashMap;

public class StringQuest {
	
	public static void mostOccuring(String s) {
		
		char [] arr = s.toCharArray();
		int len = arr.length;
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(int i=0 ; i<len ; i++) {
			
			if(map.containsKey(arr[i])) {
				
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		int max = Integer.MIN_VALUE;
		char ch = 0 ;
		for(Character s1 : map.keySet()) {
			
			if(map.get(s1)>=max) {
				max = map.get(s1);
				ch = s1;
			}
			
		}
		System.out.print(ch + " " + max);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abbcabcbb";
		mostOccuring(s);
		

	}

}
