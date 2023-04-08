package com.core.general;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	
	public static void main(String[] args) {
		String data="Sreeroop is = an engineer; "
				+ "he is = computer engineer; ";
		StringTokenizer str=new StringTokenizer(data,"=;");
		//by default space and \n is delimiters
		while(str.hasMoreTokens()) {
			System.out.println( str.nextToken());
		}
	}
}
