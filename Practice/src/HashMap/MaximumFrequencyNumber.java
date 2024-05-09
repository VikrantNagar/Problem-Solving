package HashMap;

import java.util.HashMap;
import java.util.Scanner;


public class MaximumFrequencyNumber {
	
	  public static int maxFrequencyNumber(int[] arr){ 
		  
		  HashMap<Integer, Integer> map = new HashMap<>();
		  for(int i=0; i<arr.length ; i++) {	 
		  if(map.containsKey(arr[i])) {
			  
			  int freq = map.get(arr[i]);
			  freq++;
			  map.put(arr[i], freq);
		  }else
          {
              map.put(arr[i], 1);
          }
		 
		  }
		  
		  int max_count = 0, res = -1;
          
	        for(java.util.Map.Entry<Integer, Integer> val : map.entrySet())
	        {
	            if (max_count < val.getValue())
	            {
	                res = val.getKey();
	                max_count = val.getValue();
	            }
	        }
	          
	        return res;
		  
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<arr.length ; i++) {
			arr[i] = s.nextInt();
		}
		s.close();
		
		int number = maxFrequencyNumber(arr);
		System.out.println(number);

	}

}
