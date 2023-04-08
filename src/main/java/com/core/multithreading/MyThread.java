package com.core.multithreading;


//We can do the same in a single class only
 public class MyThread extends Thread {

    public void run()
    {
        int i=1;
        while(i<1000){
            System.out.println("Hi"+i);
            i++;
        }
    }
}

 class Test{
    public static void main(String[] args){
        MyThread mt=new MyThread();
        mt.start();

        int j=1;
        while(j<1000){
            System.out.println("Hahaha"+j);
            j++;
        }
    }
}
