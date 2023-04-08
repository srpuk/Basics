package com.core.java8;

@FunctionalInterface
interface MyMethodReference{
    public void display(String str);
        }

public class MethodReference{
    public MethodReference(){
        System.out.println("Hello from constructor");
    }

    public void HelloName(String str){
        System.out.println("Hello"+str);
    }

    public static void main(String[] args) {
        MethodReference methodreference=new MethodReference();
        MyMethodReference mymer = System.out::println; //if static
        MyMethodReference mymer2= methodreference::HelloName; //instance
        //MyMethodReference mymer3=MethodReference::new; if constructor is referenced
        mymer.display("Annana");
        mymer2.display("Annana");
    }
}
