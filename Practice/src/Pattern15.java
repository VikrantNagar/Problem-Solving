import java.util.Scanner;

public class Pattern15 {

       
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        int sum = 1;
        while(i<=n){
            	if(i==1)
            	{
            		System.out.print(i+"="+1);  	
            
            	}else {
            	int k = 1;
            	while(k<i)	
            	{
                	
                		System.out.print(k+"+");
//                    System.out.print();
                		k = k+1;
                	
            	}
            	
            	sum = sum+i;
            System.out.print(i+"="+sum);
            	}
            	
            	System.out.println();
            i = i+1;
        }

    }   
	
}
