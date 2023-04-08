package com.core.general;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author sreeroopshiv
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CustomAnnotation{String myName();}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonElement {
    public String key();
}

public class JavaDocAndAnnotations{

    @JsonElement(key="tested")
    public String x;
    
	public static void main(String[] args) {
		JavaDocAndAnnotations javadoc=new JavaDocAndAnnotations();
		javadoc.display(3);

	}
	/**
	 * 
	 * @param x value of the parameter
	 */
	public void display(int n) {
		System.out.println("Hi "+n );
		System.out.println("Hi "+x );
	}
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}



}
