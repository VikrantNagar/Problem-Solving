import java.util.Scanner;

public class RecursionQuickSort {
	
	public static void quickSort(int [] arr, int si, int ei) {
	
		if(si >= ei) {
			return;
		}
		int pivotIndex = partitiion(arr, si, ei);
		quickSort(arr, si, pivotIndex-1);
		quickSort(arr, pivotIndex+1, ei );
	}
	
	public static int partitiion(int a[], int si, int ei) {
		int pivotElement = a[si];
		int smallNumberCount = 0;
		for(int i=si+1; i<=ei ; i++) {
			if(a[i]<pivotElement) {
				smallNumberCount++;
				
			}
		}
		int temp = a[si + smallNumberCount];
		a[si+ smallNumberCount] = pivotElement;
		a[si] = temp;
		int i = si;
		int j = ei;
		while(i<j) {
			if(a[i]<pivotElement) {
				i++;
			}else if(a[j]>=pivotElement) {
				j--;
			}else {
				 temp = a[i];
				 a[i] = a[j];
				 a[j] = temp;
				 i++;
				 j--;
				
			}
		}
		return si + smallNumberCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int[n];
		for(int i=0 ; i<n ; i++) {
			arr[i] = s.nextInt();
		}
		int si = s.nextInt();
		int ei = s.nextInt();
		quickSort(arr, si, ei);
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
