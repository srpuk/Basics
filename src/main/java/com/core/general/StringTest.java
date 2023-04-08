package com.core.general;

public class StringTest {

	private static String str1="Hi";
	//String is immutable
	public static void main(String[] args) {
		String str2=new String ("Hi");//this will create a new object even if we have a same string
		StringTest strtest=new StringTest();
		String s="hi";
		s.concat(" and hello1");
		System.out.println(s);
		s=s.concat(" and hello2");
		System.out.println(s);
		String s1=s.concat(" and hello3");
		System.out.println(s1);
		strtest.isIntegerImmutable();

		if (str1==str2)
			System.out.println("equal");
		else
			System.out.println("Not equal");

		if (str1.equals(str2))
			System.out.println("equal");
		else
			System.out.println("Not equal");

		System.out.println("Character at 1st :"+str1.charAt(1));
		System.out.println("Upper case :"+str1.toUpperCase());
	}
	
	public void isIntegerImmutable() {
		Integer x=new Integer(10);
		add(x);
		System.out.println("value of x is :"+ x);
		x=x+10;
		System.out.println("value of x is :"+ x);
		int y=x+10;
		System.out.println("value of y is :"+ y);
		
	}
	public void add(Integer x) {
		x=x+1;
	}
}
