package com.core.sort;

//elements are sorting themself
//all the elements left to a element should be lesser and right should be larger
//divide and conquer
//left to right i, right to left j now swap if we find any two
//where ever j crosees i, position of pivot is j

//Analysis
//nlogn best case  and average case
//worst case- doin on a sorted list n^2
//select random element as pivot
//space complexity-> worst n , best logn height of tree is directly propritional to stack space
public class QuickSort {
    public int partition(int[] a,int l,int h) {
        int pi = a[l];
        int i = l;
        int j = h-1;

        while (i < j) {

            while (a[i] <= pi&&(i<h)){
                    i++;
            }

             while (a[j] > pi&&(j>=0)){
                 j--;
             }

            if(i<j){
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }

        }
        int temp2=a[l];
        a[l]=a[j];
        a[j]=temp2;
        return j;

    }
    public void quickSort(int[] ar,int l,int h){
        if(l<h){
            int pivot=partition(ar,l,h);
            quickSort(ar,l,pivot);
            quickSort(ar,pivot+1,h);
        }
    }

    public static void main(String[] args){
        int[] arr={6,6,6,6,99999999,8,53,234,55,4,3,5,668,9,8764,32,57,89,865,4324567,999,999,999,12,45,79,19,12,9};
        QuickSort qs=new QuickSort();
        qs.quickSort(arr,0,arr.length);
        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
