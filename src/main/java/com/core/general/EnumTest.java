package com.core.general;

public class EnumTest {

    enum color{RED,GREEN,BLUE}

    /* internally above enum Color is converted to
    class Color
       {
           public static final Color RED = new Color();
           public static final Color BLUE = new Color();
            public static final Color GREEN = new Color();
       }*/

    //just like classes, you can give them constructor, add instance variables and methods,
    // and even implement interfaces.

    //One thing to keep in mind is that, unlike classes, enumerations neither inherit
    // other classes nor can get extended(i.e become superclass)
    public static void main(String []args){
        System.out.printf(color.BLUE.name());
    }
}
