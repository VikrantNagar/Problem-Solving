import java.util.HashMap;

public class StringQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Big black bug bit a big black dog on his big black nose";
		
		String [] arr = str.split(" ");
		int n = arr.length;
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for(int i=0; i<n ; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
			
		}
		for(String t : map.keySet()){
          if(map.get(t) > 1){
              System.out.println("Word = " + t + " Count " + map.get(t));
          }
      }
}
}
