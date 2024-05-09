import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
//         Write your code here.
       
         if(s.length()>1){
        
        	 String [] str = s.trim().split("[! ,?._'@]+");
        	 System.out.println(str.length);
        for(String str1 : str){
         System.out.println(str1);   
        }
        }
        else {    
          System.out.print("0");
        }
        scan.close();
    }

	}


