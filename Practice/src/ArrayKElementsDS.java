import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;

public class ArrayKElementsDS {
	
	public static void findOccurence(int arr [], int k) {
		
		int n = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0 ;i<n ;i++) {
			if(map.containsKey(arr[i])) {	
				map.put(arr[i], map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		
		List<Map.Entry<Integer, Integer>> list =  new ArrayList<Map.Entry<Integer, Integer> >(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {

			@Override
			public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
				// TODO Auto-generated method stub
				if(o1.getValue() == o2.getValue())
					return o2.getKey()-o1.getKey();
				else
                    return o2.getValue() - o1.getValue();
			}
		});
		
		for (int i = 0; i < k; i++)
            System.out.print(list.get(i).getKey() + " ");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [] =  {7, 10, 11, 5, 2, 5, 5, 7, 11, 8, 9};
		int K = 4;
		
		findOccurence(arr, K);
				
				

	}

}
