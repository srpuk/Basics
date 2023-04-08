package com.core.general;

import com.core.collections.EmployeePojo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionExample {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		// TODO Auto-generated method stub

		EmployeePojo empPojo=new EmployeePojo();
		Class className=empPojo.getClass();
		System.out.println("Class name is "+className);
		
		Method[] methods=empPojo.getClass().getMethods();
		for(Method m:methods) {
			System.out.println(m.getName());
		}
		
		Field[] fields=empPojo.getClass().getDeclaredFields();
		for(Field f:fields) {
			System.out.println("Fields are "+f.getName());
		}
		
		//System.out.println(empPojo.getFinal()); this is error
	    Method m1=empPojo.getClass().getDeclaredMethod("getFinal");
	    m1.setAccessible(true);
	    System.out.println("value from private method is "+ m1.invoke(empPojo));
	
	    
	    Field f1=empPojo.getClass().getDeclaredField("k");
	    f1.setAccessible(true);
	    f1.set(empPojo, 10);
	    System.out.println("value of final k, after edit is "+ f1.getInt(empPojo));
	    
	    Method m2=empPojo.getClass().getDeclaredMethod("getFinal");
	    m2.setAccessible(true);
	    System.out.println("value from private method is "+ m2.invoke(empPojo));
	    //just to demonstrate that the original value of final variable is not changed
	}

}
