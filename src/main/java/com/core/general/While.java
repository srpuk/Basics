package com.core.general;

public class While {

    public static int pup=5;
    public static void main(String[] args){
        while(pup>0) {
            System.out.println("inside while");
            pup = pup - 1;
            if (pup == 2) {
                continue;
            }//continue wont consider the next lines inside loop
            System.out.println("for " + (pup + 1) + "th time");
            if (pup == 1) {
                break;
            }//exits from the loop
        }
    }
}
