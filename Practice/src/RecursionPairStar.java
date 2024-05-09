import java.util.Scanner;

public class RecursionPairStar {
	
	public static String addStars(String s) {
		
		if(s.length()==1)
            return s;
		
        String smallans=addStars(s.substring(1));
        
        if(s.charAt(0)==smallans.charAt(0))
            return s.charAt(0)+"*"+smallans;
        else
            return s.charAt(0)+smallans;
				

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		System.out.print(addStars(str));

	}

}
