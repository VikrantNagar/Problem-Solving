
public class ArrayToString {

	public static String solve(String[] arr, int maxLength, int n){
	    String res = "";
	    for(int j = 0 ; j < maxLength ; j++){
	        for(int i = 0; i < n ; i++){
	            String cur = arr[i];
	            if(j < cur.length()){
	                res += cur.charAt(j);
	            }
	        }
	    }
	    return res;
	}

	public static void main(String[] args){

		
	    String[] arr = {"Ashishbcajb", "" ,"kumar", "pradhan"};
	    int maxLength = 0;
	    int n = arr.length;
	    for(int i = 0; i < n ; i++){
	        int curLength = arr[i].length();
	        if(maxLength < curLength) maxLength = curLength;
	    }
	    System.out.println("Result = " + solve(arr,maxLength,n));

	}
}