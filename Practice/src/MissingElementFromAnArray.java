import java.util.Scanner;

public class MissingElementFromAnArray {
	
	public static int missingElement(int arr[]) {
		
		int startIndex = 0;
		int endIndex = arr.length-1;
		int mid = (startIndex + endIndex)/2;
		
		for(int i=0 ; i<mid ; i++) {
			
			if(mid+1 != arr[mid]) {
				endIndex = mid;
				mid=(startIndex + endIndex)/2;
			}
			
			else if(mid+1 == arr[mid]) {
				startIndex = mid;
				mid = (startIndex + endIndex)/2;
			}
			else if(mid+1 == startIndex || mid+1 == endIndex) {
				return (arr[mid]+1);
			}
			
		}
		
		
		return (arr[mid]+1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int [] arr = new int[N];
		
		for(int i=0; i<N ; i++) {
			
			arr[i] = s.nextInt();
		}
		
		System.out.println(missingElement(arr));

	}

}
