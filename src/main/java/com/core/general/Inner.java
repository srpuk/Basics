package com.core.general;

public class Inner {

	public static void main(String args[]){
		Inner outer2=new Inner();
		outer2.substract();
		Inner.InnerClass inner2=outer2.new InnerClass();
		inner2.add();
	}

	private int innervariable=4;
	public void substract() {
		System.out.println("substracted value :"+(10-innervariable));
	}
	
	public class InnerClass{
		
		public void add() {
			System.out.println("Added value is "+(innervariable+10));//using private member
			//providing more security
			
		}
	}
}
