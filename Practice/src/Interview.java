
public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2,3,1,1,4,1,3};
		int len = arr.length;
				
		for(int i=0 ; i<len-1 ; i++) {
			
			if(arr[i] >0) {
				
				i= i+arr[i];
				
				if(i>len-1) {
					i = i+arr[i]/2;
				}
			}
			else {
				System.out.print("false");
			}
				
		}
		
	}

}
