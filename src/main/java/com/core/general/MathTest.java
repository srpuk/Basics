package com.core.general;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

public class MathTest {
	private static double myDoubleNum=98784.12;
	public static void main(String[] args) throws FileNotFoundException, IOException  {
		// TODO Auto-generated method stub
		float myFloatNum = 5.99f;
		BigDecimal bd1=new BigDecimal(452.8741423);
        float a=5.2582f;
		int b=4;
		int c=6;
		System.out.println(myFloatNum);
    	myDoubleNum=Math.round(myDoubleNum);
    	System.out.println(myDoubleNum);
    	bd1=bd1.add(bd1);
    	System.out.println(bd1);
 	   
 	   System.out.println("Floor :"+Math.floor(a));
 	   System.out.println("Ceil :"+Math.ceil(a));
 	   System.out.println("Power :"+Math.pow(a, b));

	}
	}

