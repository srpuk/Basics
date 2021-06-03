package general;

public class CustomException extends Exception{

	public CustomException(String s) {
		super(s);
	}
	
	public CustomException() {}
	
	
	public static void main(String[] args) {
		CustomException exp=new CustomException();
		try {
			exp.add(12,45);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		exp.subtract();
	}
	
	public int add(int a,int b) throws CustomException {

		throw new CustomException("Bad keyword");
	}
	
	public int subtract() {
		try {
			throw new CustomException("inside try");
		}
		catch (CustomException e) {
			e.printStackTrace();// TODO: handle exception
		}
		return 12;
	}
	
}
