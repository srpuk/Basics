package com.core.java8;


@FunctionalInterface
 interface TestInterface{
	public int sum(int a,int b);
}

@FunctionalInterface
interface TestInterface2{
	public void print();
}

public class LambdaExample {
	
	public static void main(String[] args) {
		
	TestInterface testInterface=(i,j)->i+j;
	//here java understands the result needs to be returned
	//we could have achieved it either by implementing and overriding the method or
	//by using anonymous class
	//but using lambda ,it has become lot easier
	System.out.println(testInterface.sum(10, 78));
	
	TestInterface2 testInterface2=()->{
		System.out.println("multiple lines");
		System.out.println("in a single lambda function");
		System.out.println("if we give single statement inside bracket, it will throw error");
	};
	testInterface2.print();
	
	}

}
