package com.core.java8;

@FunctionalInterface
 interface MyLambda{
    public int display();
}
//use a new class which implements functional interface and call the method
public class Lambda implements MyLambda{

     @Override
     public int display(){
    System.out.println("Hello");
    return 1;
}

public static void main(String[] args) {
    Lambda lambda = new Lambda();
    lambda.display();

//use of anonymous class to call method
    MyLambda lambda1=new MyLambda() {
        @Override
        public int display() {
            System.out.println("Hello1");
            return 1;
        }
    };
    lambda1.display();



    MyLambda lambda2=()->{System.out.println("Hello from lambda"); return 1;};
    lambda2.display();
}
}
