package com.core.multithreading;

public class InterThreadCommunication {

	
	//different type of synchronization is required in producer-consumer
	//notify all is also there
	
	public static void main(String[] args) {
		MyData1 mda=new MyData1();
		ProducerThread pt=new ProducerThread(mda);
		ConsumerThread ct=new ConsumerThread(mda);
		pt.start();
		ct.start();
		
	}
	}
	
	class ConsumerThread extends Thread{
		
		MyData1 md;
	    public ConsumerThread(MyData1 my) {
			md=my;
		}
		public void run() {
			while(true) {
			try {
				System.out.println("Consumed :"+md.getValue());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		}
	
	}
	
	
	class ProducerThread extends Thread{
		MyData1 md1;
		public ProducerThread(MyData1 my) {
			md1=my;
		
		}

	public void run() {
			
			int i=0;
			while(true) {
			try {
				md1.setValue(i);
				System.out.println("Produced: "+i);
				i++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		}
	}
	
	
	class MyData1{
		
		boolean flag=true;
		int value;
		synchronized public void setValue(int m) throws InterruptedException {
			while(flag!=true) {
				wait();
				}
			    this.value=m;
			    flag=false;
			    notify();
			
		}
		
		synchronized public int getValue() throws InterruptedException {
			int x=0;
			while(flag!=false) {
				wait();
			}
				x=value;
				flag=true;
				notify();
			return x;
		}
	}
