package general;

class Simple{
	
	public void getNothing() {
		System.out.println("Hihihihi");
	}
}

class Clone implements Cloneable{
	
	String name;
	String id;
	
	public Clone(String n,String i) {
		this.name=n;
		this.id=i;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class ObjectCreationEg {


	public static void main(String[] args) {
	
		//newInstance
	try {
	Class c=Class.forName("general.Simple");
	Simple s=(Simple)c.newInstance();
	s.getNothing();
	
	}catch(Exception e) {e.printStackTrace();}
	

	//Clone
	
	try {
		
		Clone clone=new Clone("sree","12");
		Clone clone2=(Clone) clone.clone();
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	}
}

