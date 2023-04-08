package com.core.general;

public class OuterClass {
	public static void main(String []args){
		OuterClass outer=new OuterClass();
		OuterClass.InnerClass inner=outer.new InnerClass();
		outer.outermethod();
		inner.innerMethod();
	}
	private int age=10;
	public void outermethod() {
		System.out.println(" i am from outer class");
	}
	public class InnerClass {

			public void innerMethod() {
				System.out.println("age:"+age);
			}
		}
		
		

	}
