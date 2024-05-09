
public class ComplexNumberUse {

	private int realNo;
	private int imaginary;
	private int realNo1;
	private int imaginary1;

	public ComplexNumberUse(int real1, int imaginary1) {
		// TODO Auto-generated constructor stub
		this.realNo = real1;
		this.imaginary = imaginary1;
		this.realNo1 = real1;
		this.imaginary1 = imaginary1;
		
	}
	void plus(ComplexNumberUse c2) {
		// TODO Auto-generated method stub
		this.realNo1 = this.realNo + c2.realNo;
		this.imaginary1 = this.imaginary + c2.imaginary;
		
		
	}
	
	public void multiply(ComplexNumberUse c2) {
		// TODO Auto-generated method stub
		this.realNo1 = (this.realNo * c2.realNo) - (this.imaginary * c2.imaginary);
		this.imaginary1 = (this.realNo * c2.imaginary) + (this.imaginary * c2.realNo);
		
	}
	
	
	public void print() {
		System.out.print(realNo1 + " + " + " i" + imaginary1);
	}
	

}
