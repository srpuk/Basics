package Search;

import java.util.Scanner;

public class LinearSearch {
    boolean flag=false;
    public boolean linearSearch(int[] a,int val){
        int n=a.length;
        for(int i=0;i<n;i++){
            if(a[i]==val){flag=true;}
        }
        return flag;
    }

    public static void main(String[] args){
        int val;
        int[] arr={23423,44,555,34,3,222,4567,6777,4332,432};
        System.out.println("Enter the value to be searched");
        Scanner sc=new Scanner(System.in);
        val=sc.nextInt();
        LinearSearch lin=new LinearSearch();
        boolean x=lin.linearSearch(arr,val);
        System.out.println(x);


    }
}
