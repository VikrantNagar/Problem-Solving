import java.util.Scanner;

public class FirstDuplicateElementInArray {
	
	public static void duplicateElement(int arr[]) {
		
		for(int i = 0 ; i<arr.length-1 ; i++) {
			if(arr[i] == arr[i+1]) {
				System.out.println(arr[i]);
				break;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i] = s.nextInt();
			}
		s.close();
		duplicateElement(arr);
	}

}
