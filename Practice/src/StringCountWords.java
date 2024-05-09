import java.util.Scanner;

public class StringCountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		if(str.length() !=0) {
		String ar[] = str.split(" ");
		System.out.print(ar.length);
	}
	}
}
