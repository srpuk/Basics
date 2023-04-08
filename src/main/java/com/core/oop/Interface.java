package com.core.oop;

public class Interface implements Interface3 {

//we should define all the methods of interfaces here
	public void GetTyres(){
		System.out.println("Got the tyres");
	};
	public void GetBody(){
		System.out.println("Got the Body");
	};
	@Override  // i dont know it is necessary or not
	public void getWindow(){
		System.out.println("Got the windows");
	};
	public void getChasis(){
		System.out.println("Got the chasis");
	};




	public static void main(String []args){
       Interface3 interfaceImplementation=new Interface();
	   interfaceImplementation.getChasis();

	}
}
interface Interface1 {
	public void GetTyres();
	public void GetBody();
}
interface Interface2 {
	public void getWindow();
}
interface Interface3 extends Interface1,Interface2{
	public void getWindow();
	public void getChasis();
}
