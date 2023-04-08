package com.core.oop;

public class Encapsulation {

	public static void main(String args[]){
		Encapsulation encap=new Encapsulation();
		encap.setEmpid(2);
		System.out.println("The secured value is :"+encap.getEmpid());
	}
	private int empid;

	public void setEmpid(int i){
		this.empid=i;
		
	}
	
	public int getEmpid(){
		return empid;
	}
}
