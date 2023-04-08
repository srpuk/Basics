package com.core.general;

public class Static {

	public static void main(String []args){
		Static.useStatic();  //static method can be called without object
	}
	
	public static int a=89;
	public int b=78;
	public static final int c=899;
	
	public static void useStatic(){
		a=a+11;
		System.out.println("Value of static a"+a);
		//b=b+22; it will throw as b is not static
		//c=c+101; c cannot be assigned any value
	}

}
