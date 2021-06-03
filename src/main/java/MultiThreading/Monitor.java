package MultiThreading;

public class Monitor {

public static void main(String[] arg) {
		MyData my=new MyData();
	    Thread1 t1=new Thread1(my);
		Thread2 t2=new Thread2(my);
		t1.start();
		t2.start();
	}
	
	
}

class Thread2 extends Thread{
	 MyData md;
	 
	 Thread2(MyData my){
		 md=my;
	 }
	  
	 public void run() {
		 
		  md.display("Welcome");
	  }
	}


class Thread1 extends Thread{
	MyData md1;
	
	Thread1(MyData my){
		md1=my;
	}
  public void run() {

	  md1.display("Hello world");
  }
}



class MyData {
    
	synchronized public void display(String name) { //method itself is synchronized
	for(int i=0;i<name.length();i++) {
		System.out.println(name.charAt(i));
	}
	}
}
