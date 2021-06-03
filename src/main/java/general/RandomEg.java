package general;

import java.util.Random;

public class RandomEg {
	
	
	public static void main(String[] args) {
		
	//one way	
    int a= (int)(Math.random()*10);
     System.out.println(a);
     
    //second
     
     
     Random rand=new Random();
     int b= rand.nextInt(21);
     System.out.println(b);
     
	}


}
