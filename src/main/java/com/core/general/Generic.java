package com.core.general;

public class Generic{

	public static void main(String[] args) {
		
		Test<Integer> tst=new Test<Integer>(12);
		System.out.println(tst.getObj());
		
		genericFunction.display("Hello india");
		genericFunction.display(12);
		
		
	}

}

class Test<T>{
	T obj;
	public Test(T obj) {
		this.obj=obj;
	}
	
	public T getObj() {
		return this.obj;
	}
}

 class genericFunction {
	
	 static <T> void display(T element) {
		
		 System.out.println(element.getClass().getName()+"Value :"+element);
		 
	 }
}