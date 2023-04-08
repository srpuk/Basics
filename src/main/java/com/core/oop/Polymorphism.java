package com.core.oop;

public class Polymorphism {
	public static void main(String[] args) {
		Polymorphism poly1 = new Polymorphism();//normal
		Polymorphism poly2 = new com.core.oop.PolySubclass();//polymorphism applied
		poly1.print();
		poly2.print();

		PolySubclass poly3 = new PolySubclass();//understand this order
		poly3.print2();
	}
	public void print(){
		System.out.println("i am from the super class");
	}
}


	class PolySubclass extends Polymorphism {
		public void print(){
			System.out.println("i am from subclass");
		}
		public void print2(){
			System.out.println("i am from subclass,and i am the second one");
		}

	}
