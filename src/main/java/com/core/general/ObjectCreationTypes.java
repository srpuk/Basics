package com.core.general;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectCreationTypes {
	
public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IOException {
	
	//1
	ObjectCreationTypes oct=new ObjectCreationTypes();
	//2
	
	ObjectCreationTypes oct2=(ObjectCreationTypes)oct.clone();
	
	//3
	ObjectCreationTypes oct3=ObjectCreationTypes.class.newInstance();
	
	//4
	//deserialization
	FileOutputStream fip=new FileOutputStream("");
	try {
		ObjectOutputStream oboutput=new ObjectOutputStream(fip);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
