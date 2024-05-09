import java.util.Scanner;

public class LeadersInArray {
	
public static void leaders(int[] input) {
	int size = input.length;

	for (int i = 0; i < size; i++) 
    {
        int j;
        for (j = i + 1; j < size; j++) 
        {
            if (input[i] <input[j])
                break;
        }
        if (j == size) // the loop didn't break
            System.out.print(input[i] + " ");
    }
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] arr = new int[n];
		for(int i=0; i <n ;i++) {
			arr[i] = s.nextInt();
			
		}
		leaders(arr);

	}

}
