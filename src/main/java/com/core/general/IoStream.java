package com.core.general;

import java.io.*;

public class IoStream {

	public static void main(String[] args) throws IOException,FileNotFoundException {
		// TODO Auto-generated method stub
		
		String value="Hi this is a test for streams";
		FileOutputStream fo=new FileOutputStream("src/testinputoutput.txt");
		fo.write(value.getBytes());
		fo.flush();
		//fo.close();
		
		
        FileInputStream fi=new FileInputStream("src/testinputoutput.txt");
        int c;
        while((c=fi.read())!=-1) {
        	System.out.print((char)c);
        }
        
        //buffered streams can be used when data is very large or speed of two systems are
        //not compatible
        BufferedOutputStream bufos=new BufferedOutputStream(fo);
        String value2="Hi this is a test for streams using buffered streams";
        bufos.write(value2.getBytes());
        bufos.flush();
        bufos.close();
        fo.close();
        
        
	}
	
	

}
