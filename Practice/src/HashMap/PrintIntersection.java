package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class PrintIntersection {
	
	public static void printIntersection(int[] arr1,int[] arr2){

//		HashMap<Integer, Integer> map = new HashMap<>();
//		for(int i=0 ; i<arr1.length ; i++) {
//				map.put(arr1[i], 1);
//			}
//		for(int i=0 ; i<arr1.length && i<arr2.length ; i++) {
//			if(map.containsKey(arr2[i])) {
//				System.out.print(arr2[i] + " ");
//			}
//		}
		HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int key:arr1)
        {	
            if(map.containsKey(key))
        	{
            	map.put(key,map.get(key)+1);
        	}
            else
            {
                map.put(key,1);
            }
            
        }
        Arrays.sort(arr2);
        for (int key:arr2)
        {
            if (map.containsKey(key))
            {
                int val = map.get(key);
                if (val>0)
                {
                    System.out.println(key + " ");
                    map.put(key,val-1);
                }
                
            }
        }   
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int M = s.nextInt();
		int ARR1 [] = new int[N];
		int ARR2 [] = new int[M];
		
		for(int i=0 ; i<N ; i++) {
			ARR1[i] = s.nextInt();
		}
		for(int i=0 ; i<M ; i++) {
			ARR2[i] = s.nextInt();
		}
		s.close();
		printIntersection(ARR1, ARR2);
		

	}

}
