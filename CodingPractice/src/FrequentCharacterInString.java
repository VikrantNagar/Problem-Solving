import java.util.HashMap;

public class FrequentCharacterInString {
	
	public static void frequencyOfCharacter(String str) {
		
		String[] arr = str.split("");
		HashMap<String, Integer> map = new HashMap<>();
		for(int i=0 ; i<arr.length ; i++) {
			
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		String ch = null ;
		
		for(String s : map.keySet()) {
			
			if(map.get(s) > max) {
				secMax = max;
				max = map.get(s);
				ch = s;
			
			}
//				else if(map.get(s) > secMax && map.get(s) !=max ) {
//				secMax = map.get(s);
//				ch = s;
//			}
		}
		System.out.print(ch);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str = "te3esest";
			frequencyOfCharacter(str);
	}

}
