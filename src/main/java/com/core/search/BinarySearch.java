package com.core.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BinarySearch {
    boolean flag=false;
    public boolean binarySearch(int[] arr, int val,int low,int high){
int[] arr1=arr;
int val1=val;
int l=low;
int h=high;
int m=(l+h)/2;
       if(val==arr1[m]){flag=true;}
       else if(val>arr1[m]&&l<=h) {
           binarySearch(arr1,val1,m+1,h);
       } else if(val<arr1[m]&&l<=h){
           binarySearch(arr1,val1,l,m-1);
       }
return flag;
    }

    public static void main(String[] args){
        int val;
        int[] arr={23423,44,555,34,3,4567,6777,4332,432};
        Arrays.sort(arr);
        System.out.println("Enter the value to be searched");
        Scanner sc=new Scanner(System.in);
        val=sc.nextInt();
        BinarySearch lin=new BinarySearch();
        int n=arr.length;
        int low=0;
        int high=n-1;
        boolean x=lin.binarySearch(arr,val,low,high);
        System.out.println(x);


        List<Integer> test=new ArrayList<Integer>();
        test.add(3);
        test.add(8);
        test.add(27);
        List<Integer> filtered=test.stream().filter(Integer->Integer.longValue()>8).collect(Collectors.toList());
        System.out.println(filtered.get(0));

    }
}
