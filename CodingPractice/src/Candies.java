import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Candies {
	
	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	    
        int totalCandies = 0;
        int len = candies.length;
        int greatest = 0;
        
        List<Boolean> list = new ArrayList<Boolean>(Arrays.asList(new Boolean[len]));
        Collections.fill(list, Boolean.FALSE);
        
        for(int i=0 ; i<len ; i++){
            if(candies[i] > greatest){
                greatest = candies[i];
            }
        }

        for(int i=0 ; i<len ; i++){
            totalCandies = extraCandies + candies[i];
            if(totalCandies >= greatest){
                    list.set(i,true);
            }
        }
        return list;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int extraCandies = s.nextInt();
		int [] candies = new int[n];
		
		for(int i=0 ; i<n ; i++) {
			candies[i] = s.nextInt();
		}
		
		System.out.print(kidsWithCandies(candies, extraCandies));
		
		s.close();
		
	}

}
