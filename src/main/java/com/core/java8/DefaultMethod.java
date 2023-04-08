package com.core.java8;


interface NewJava8Interface{
    static void show1(){
        System.out.println("Hi i am from static");
    }

    default void show(){

        System.out.println("i am the new method");
    }
}
public class DefaultMethod implements NewJava8Interface {


    public static void main(String[] args) {

        NewJava8Interface.show1();
        DefaultMethod dm = new DefaultMethod();
        dm.show();
    }
}
//In case both the implemented interfaces contain default methods with same method signature,
// the implementing class should explicitly specify which default method is to be used or it
// should override the default method