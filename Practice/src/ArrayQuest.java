
public class ArrayQuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		
		//rotation count 1; {5,1,2,3,4}
	//{4,5,1,2,3}
		int len = arr.length;
		int arr1[] = new int[len];
		int rotationCount = 5;
		int k=0;
		
		for(int i=0 ; i<rotationCount ; i++) {
			arr1[i] = arr[len-rotationCount+i];
		//	rotationCount--;
		}
		for(int j=rotationCount; j<arr1.length ; j++) {
			arr1[j] = arr[k];
			k++;
		}
		for(int i=0 ; i<arr1.length ; i++) {
			System.out.print(arr1[i]);
		}

	}

}
