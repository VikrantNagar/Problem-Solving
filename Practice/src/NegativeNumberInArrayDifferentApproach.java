import java.util.Scanner;

public class NegativeNumberInArrayDifferentApproach {

	public static boolean NegativeNumber(int arr[]) {

		int l = 0;
		int r = arr.length - 1;

		while (l < r) {

			if (arr[l] > 0 && arr[r] > 0) {
				r--;
			} else if (arr[l] > 0 && arr[r] < 0) {
				int swap = arr[l];
				arr[l] = arr[r];
				arr[r] = swap;
				l++;
				r--;

			} else if (arr[l] < 0 && arr[r] > 0) {
				l++;
				r--;
			} else {
				l++;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for (int j = 0; j < t; j++) {
			int N = s.nextInt();
			if (N > 0) {
				int arr[] = new int[N];

				for (int i = 0; i < N; i++) {
					arr[i] = s.nextInt();
				}
				NegativeNumber(arr);
			}
		}

	}

}
