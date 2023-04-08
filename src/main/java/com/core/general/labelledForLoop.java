package com.core.general;

public class labelledForLoop {
	
	public static void main(String[] args) {
	
		label: //we used this label to specify exactly where to break
			for(int i=0;i<5;i++) {
				display(i);
				for(int j=0;j<3;j++) {
					if(i==2&&j==2) {
						display(i,j);
						break label;
					}
				}
			}
		
		
	}
	
	public static void display(int i) {
		System.out.println(i);
	}
	public static void display(int i,int j) {
		System.out.println(i+" "+j);
	}
}
