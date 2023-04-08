package com.core.general;

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
	Class c=Class.forName("com.core.general.Simple");
	Simple s=(Simple)c.newInstance();
	s.getNothing();
	
	} catch (ClassNotFoundException e) {
		throw new RuntimeException(e);
	} catch (InstantiationException e) {
		throw new RuntimeException(e);
	} catch (IllegalAccessException e) {
		throw new RuntimeException(e);
	}


		//Clone
	
	try {
		
		Clone clone=new Clone("sree","12");
		Clone clone2=(Clone) clone.clone();
		
	}catch(CloneNotSupportedException e) {
		e.printStackTrace();
	}
	
	
	}
}

