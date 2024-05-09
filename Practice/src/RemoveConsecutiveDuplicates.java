import java.util.ArrayList;
import java.util.Scanner;

public class RemoveConsecutiveDuplicates {
	
	public static ArrayList<Integer> removeDuplicates(int arr[]){
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(arr[0]);
		for(int i=1 ; i<arr.length ; i++) {
			if(arr[i] != arr[i-1]) {
				result.add(arr[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int n  = s.nextInt();
		int arr1[] = new int[n];
		for(int i=0 ; i<arr1.length ; i++) {
			arr1[i] = s.nextInt();
		}
		ArrayList<Integer> result = removeDuplicates(arr1);
		for(int i=0 ; i<result.size() ; i++) {
			System.out.print(result.get(i) + " ");
		}
	}

}
