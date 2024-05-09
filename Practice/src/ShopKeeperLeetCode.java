
public class ShopKeeperLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String customers = "YYNY";
		int len = customers.length();
		int sum = 0;
		int max = 0;
		for(int i=0 ; i<=len ; i++) {
			
			for(int j=i ; j<len ; j++) {
				
				if(customers.charAt(j) == 'Y') {
					sum = sum+1;
				}
				else {
					sum = sum+0;
				}	
			}
		}
		
	}

}
