package Sort;

public class MergeSort {

    void merge(int[] ar,int beg,int mid,int end){

        int l=mid-beg+1;
        int r=end-mid;

        int[] left=new int[l];
        int[] right=new int[r];

        for(int i=0;i<l;i++){
            left[i]=ar[beg+i];
        }

        for(int j=0;j<r;j++){
            right[j]=ar[mid+1+j];
        }

        int i=0,j=0;
        int k=beg;

        while(i<l&&j<r){
            if(left[i]<right[j]){
                ar[k]=left[i];
                i++;
            }
            else {
                ar[k]=right[j];
                j++;
            }
            k++;

        }

        while(i<l){
            ar[k]=left[i];
            i++;
            k++;
        }

        while(j<r){
            ar[k]=right[j];
            j++;
            k++;
        }


    }


    public void mergeSort(int[] a,int low,int high){
        if(low==high){return;}
        else{
            int mid=(low+high)/2;
            mergeSort(a,low,mid);
            mergeSort(a,mid+1,high);
            merge(a,low,mid,high);
        }
}

public static void main(String[] args){
    int[] arr={12,67,85,3433,556,788,433,78864,333,345,554,554,0,8};
    MergeSort ms=new MergeSort();
    ms.mergeSort(arr,0,arr.length-1);

    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }
}
