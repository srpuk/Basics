package Sort;

import java.util.Scanner;

public class BubbleSort {

    public int[] bubbleSort(int[] arr ){
        int[] arr2;
        int temp;
        int n=arr.length;
        arr2=arr;
        for(int i=0;i<n;i++){
            //always from first to just before sorted
           for(int j=0;j<n-i-1;j++){
               if(arr2[j]>arr2[j+1]){
                   temp=arr2[j];
                   arr2[j]=arr2[j+1];
                   arr2[j+1]=temp;
               }
           }

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
        BubbleSort sort=new BubbleSort();
        arr3=sort.bubbleSort(arr);
        for(int p=0;p<count;p++){
            System.out.println(arr3[p]);
        }


    }

}
