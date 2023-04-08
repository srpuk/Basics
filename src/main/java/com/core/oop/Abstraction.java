package com.core.oop;

public  abstract class Abstraction {

	public static void main(String args[]){

		AbstractSub abssub=new AbstractSub();
		abssub.concrete();
		abssub.abstractMethod();
		abssub.dividebyzero();
	}

	public abstract void abstractMethod();
	public void concrete(){
		System.out.println("Hi, concrete from abtsraction");
	}
		
}

 class AbstractSub extends Abstraction {
	public float a=15.0f;  //divide by zero will give infinity in the case of float
	//exception will be thrown in the case of int
	public void abstractMethod(){
		System.out.println("Hi,This is from implemented abstract method");
	};

	public void dividebyzero(){
		System.out.println("Value is :"+(a/0));


	}}
