import java.util.Scanner;
public class BinarySearch {
	
	public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        int start = 0;
        int n = arr.length;
        int end = n-1;
        while(start<=end){
        	int mid = (start+end)/2;
            if(arr[mid]<x){
                start = mid+1;

            }else if(arr[mid]>x){
                end = mid-1;

            }else {
            	return mid;
            }

        }
		return -1;
      
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int arr[] = new int[N];
		for(int i=0; i<N; i++)	
		{
			arr[i] = s.nextInt();
		}
		int x = s.nextInt();
		System.out.print(binarySearch(arr,x));
		
		}

	}
