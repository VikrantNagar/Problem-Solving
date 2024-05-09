import java.util.Scanner;

public class MissingElementInArray {
	
	public static int MissingElement(int [] arr) {
		
		int startIndex = 0;
		int endIndex = arr.length-1;
		int mid = (startIndex + endIndex) / 2;
		//System.out.print(mid);
		
		for(int i=0 ; i < mid ; i++) {
		
			if(mid != arr[mid]) {
				endIndex = mid;
				mid = (startIndex + endIndex)/2;
				startIndex += 1;
			}
			else if(mid == arr[mid]) {
				startIndex = mid;
				mid = (startIndex + endIndex)/2;
				endIndex -=1;
			}
			else if(mid == startIndex || mid == endIndex) {
				return (arr[mid]+1);
			}
		}
		return (arr[mid]+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int arr[] = new int[n];
		for(int i = 0; i<n ; i++) {
			arr[i] = s.nextInt();
		}
		System.out.print(MissingElement(arr));
	}
}


/*

int startIndex = 0, endIndex = arr.length - 1;
int mid = 0;
while ((endIndex - startIndex) > 1) {
    mid = (startIndex + endIndex) / 2;
    if ((arr[startIndex] - startIndex) != (arr[mid] - mid))
        endIndex = mid;
    else if ((ar[endIndex] - endIndex) != (arr[mid] - mid))
        startIndex = mid;
}
return (ar[start] + 1);

*/