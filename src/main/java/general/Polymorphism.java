package general;

public class Polymorphism {
	
	void display() {
		System.out.println("Parent");
	}
	
	protected void display2() {
		System.out.println("Protected parent");
	}
	protected void display3() {
		System.out.println("Protected parent");
	}
	public static void main(String[] args) {
		
		Polymorphism poly=new Second();
		//Second sec=(Second) new Polymorphism();
		poly.display();
		poly.display2();
		poly.display3();
		//sec.display();
		Polymorphism poly2=new Polymorphism();
		poly2.display();
		poly2.display2();
		poly2.display3();
		Second sec2=new Second();
		sec2.display();
		sec2.display2();
		sec2.display3();
		
	}
	
	

}

class Second extends Polymorphism{
	
	@Override
	void display() {
		System.out.println("Child");
	}
	@Override
	protected void display3() {
		System.out.println("Protected Child");
	}
}
