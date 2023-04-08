package com.core.multithreading;

class ThreadTest extends Thread{
	
   public ThreadTest(String name) { //Constructor
	super(name);
	setPriority(MAX_PRIORITY-8);
}
   
   public void run() {
	   int count=1;
	   while(count<1000) {
		   System.out.println("MyThred:"+count);
		   count++;
		   try{
		   Thread.sleep(100);   //sleep
		   }
		   catch(InterruptedException e) {System.out.println(e);}
	   }
	   
   }
}

public  class ThreadMethods{
	public static void main(String[] args) throws InterruptedException {
		ThreadTest tt=new ThreadTest("Thread1"); //getId(),getName()
		System.out.println("Name:"+tt.getName()+" iD:"+tt.getId()+" Priority:"+tt.getPriority());
	    tt.setDaemon(true); //setting as daemon,when main ends,this will also end
		tt.start();
		
			int j=0;
		while(j<1000) {
			Thread.yield(); //will allow other threads to execute
			System.out.println("Main:"+j);
			j++;
		}
		Thread.sleep(1000); //making main thread sleep

		
		Thread mainThread=Thread.currentThread(); //referencing current thread
		mainThread.join(); //main will wait for other threads to complete,even daemon thread
		
	    tt.interrupt(); //interrupted
	}
}
