import java.util.HashMap;

public class Occurence {
	
	public static void OccurenceOfChar(int [] arr) {
		
		int len = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0 ; i<len ; i++) {
			
			if(map.containsKey(arr[i])) {
				
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		for(Integer i : map.keySet()) {
			System.out.println(i);
			System.out.println(map.get(i));
		}
		
		
		// 2 2
		// 3 1
		// 4 1
		// 5 1
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2, 3, 4, 2, 5, 3, 4, 3, 5};
		
		OccurenceOfChar(arr);
	}

}
