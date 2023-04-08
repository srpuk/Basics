package com.core.sort;

import java.util.Scanner;

public class Insertion {

    public int[] insertionSort(int[] a) {
    int[] arr2=a;
    int n=arr2.length;
    int key;
    int j;

    for(int i=1;i<n;i++){
        key=arr2[i];
        j=i-1;
        while(j>=0&&arr2[j]>key){
         arr2[j+1]=arr2[j];
         j--;
        }
        arr2[j+1]=key;
    }
return arr2;
    }

    public static void main(String[] args){
        int[] arr;
        int[] arr3;
        System.out.println("enter the number of numbers");
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        arr=new int[count];
        System.out.println("enter the numbers");
        for(int k=0;k<count;k++){
            arr[k]=sc.nextInt();
        }
        Insertion sort=new Insertion();
        arr3=sort.insertionSort(arr);
        for(int p=0;p<count;p++){
            System.out.println(arr3[p]);
        }


    }

}
