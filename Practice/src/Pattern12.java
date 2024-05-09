import java.util.Scanner;

public class Pattern12 {

public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
	Scanner s = new Scanner(System.in);
    int n = s.nextInt();
   
    int l = n/2;
    for(int i = 0 ; i < l+1 ; i++){
        for(int j = 0 ; j < l-i ; j++){
            System.out.print(" ");
        }
        for(int j = 0 ; j < 2*i+1; j++){
            System.out.print("*");
        }
        System.out.println();
    }

    for(int i = l-1 ; i >= 0 ; i--){
        for(int j = 0 ; j < l-i ; j++){
            System.out.print(" ");
        }
        for(int j = 0 ; j < 2*i+1; j++){
            System.out.print("*");
        }
        System.out.println();
    

	}
	
}}
