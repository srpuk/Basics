package com.core.general;

public class CastingEg {

	
	public static void main(String[] args) {

		int a=23;
		Integer c=Integer.valueOf(a); //coverting int to integer explicitely
		Integer d=new Integer(a); //boxing
		Integer b=a; //autoboxing
		
		
		int e=d.intValue(); //converting Integer to int explicitely
		int f=b; //autounboxing
		
		
		System.out.println("Just to prove no errors "+a+" "+b+" "+c+" "+d+" "+e+" "+f);
	}
}
