
public class RecursionTowerOfHanoi {
	
	public static void towerHanoi(int n, char s, char h, char d) {
		
		if(n==1){
			System.out.println("move 1st disk from " + s + " to "+ d);
			return;
		}
		towerHanoi(n-1, s,d,h);
		System.out.println("move " + n + " disk from " + s + " to " + d);
		
		towerHanoi(n-1, h,s,d);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerHanoi(2, 's', 'h', 'd');

	}

}
