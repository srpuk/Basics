package com.core.java8;

@FunctionalInterface
interface TestInterface3{
	public void sum(String str);
}

@FunctionalInterface
interface TestInterface4{
	public int sum(int a,int b);
}

@FunctionalInterface
interface ComparsionTest{
	public int checkComapre(String a,String b);
}

public class MethodReferenceExample {
	//this is also related to functional interface
	
	int summation(int a,int b) {
       return a+b;
	}
	public static void main(String[] args) {
	TestInterface3 testInterface3=System.out::println;
	testInterface3.sum("Hi using println");
	
	MethodReferenceExample mre=new MethodReferenceExample();
	TestInterface4 testInterface4=mre::summation;
	System.out.print("summation is called via reference "+testInterface4.sum(100, 10));
	
	ComparsionTest comparsionTest=String::compareTo;
	System.out.println("compareTo is referenced "+comparsionTest.checkComapre("Hi", "Hello"));
	System.out.println("compareTo is referenced "+comparsionTest.checkComapre("Hi", "Hi"));
	}
	
	

}
