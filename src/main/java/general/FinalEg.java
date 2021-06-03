package general;

public class FinalEg {
	final int a=2;
	final int b;
	static final int c;
	
	public FinalEg() {
		b=3; //blank final variable initialization
		//c=4;//error
	}
	
	static {
		c=5;//static blank final variable initialization
	}
	public static void main(String[] args) {
	
	}
		public void ChangeVal() {
	 	//a=a+2; //error,can't initialize from here
	}
}
