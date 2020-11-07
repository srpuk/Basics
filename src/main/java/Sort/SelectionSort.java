package Sort;

import java.util.Scanner;

public class SelectionSort {

    public int[] selectionSort(int[] arr){
     int[] arr1=arr;
     int n=arr1.length;
     int index;
        for(int i=0;i<n-1;i++) {
            int min = arr1[i];
            index=i;
           for(int j=i+1;j<n;j++) {
               if (arr1[j] < min) {
                   min = arr1[j];
                   index = j;

               }
           }
           int temp=arr1[i];
           arr1[i]=arr1[index];
           arr1[index]=temp;

        }
return arr1;
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
        SelectionSort sort=new SelectionSort();
        arr3=sort.selectionSort(arr);
        for(int p=0;p<count;p++){
            System.out.println(arr3[p]);
        }


    }
}
