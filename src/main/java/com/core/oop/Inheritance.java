package com.core.oop;

import com.core.general.This;

public class Inheritance extends This.Dummy {

	public static void main(String args[]){
		Inheritance inherit=new Inheritance();
		inherit.inherited();
		inherit.getData();
	}

	//here single inheritance is demostrated
	//multi level inheritance is nothing but inheriting from a subclass also
	//hierarchial inheritanc is nothing but more than one sub class for one super class
	public Inheritance(){
		 super(10,20); //calling super class constructor.the call should be from the constructor
	}
	int avg;
 public void inherited(){
	
	 avg=average(5,80); //this is a method of Dummy
	 System.out.println(avg);
 }
 
 @Override //overriding super class function
 public void getData(){
	 super.getData();//calling super class function
	 System.out.println("Additional info from subclass");
 }
}
