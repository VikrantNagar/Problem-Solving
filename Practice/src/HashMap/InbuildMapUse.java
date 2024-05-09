package HashMap;

import java.util.HashMap;
import java.util.Set;

public class InbuildMapUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<>();
		
		//Insertion in hashmap
		map.put("abc", 1);
		map.put("def", 3);
		
		//size of hashmap
		int mapSize = map.size();
		System.out.println(mapSize);
		
		//Check for a key in map
		if(map.containsKey("abc")) {
			System.out.println("abc is present");
		}
		if(map.containsKey("abcd")) {
			System.out.println("abcd is not present");
		}
		
		//Getting value of any key in hashmap
		int value = map.get("abc");
		System.out.println(value);
		
		int value1 = 0;
		if(map.containsKey("abc")) {
			value1 = map.get("abc");
		}

		System.out.println(value1);
		
		//remove keys from a hashmap
		map.remove("abc");
		
		map.put("ghi", 6);
		
		//Set is used to iterate over keys in hashmap
		Set<String> set =  map.keySet();
		for(String s:set) {
			System.out.println(s);
		}
		
		//Check for a value in map
		if(map.containsValue(6)) {
			System.out.println("value is present in map");
		}

	}

}
