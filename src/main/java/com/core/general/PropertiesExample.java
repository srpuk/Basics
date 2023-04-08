package com.core.general;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		PropertiesExample propeg=new PropertiesExample();
		propeg.properties();
		

	}
	
	public void properties() throws FileNotFoundException, IOException {
		Properties prop=new Properties(); //uses HashTable
	    prop.setProperty("os", "mac");
	    System.out.println(prop.get("os"));
	    
	    prop.store(new FileOutputStream("src/properties.txt"),"properties");
	    
	    //Also there is methods to load properties from xml, will see later
	}

}
