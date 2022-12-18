package com.example.datastructurecompetive.Recursion;

//This prog is to sort the arr using quick sort and recursion.
//output
//1 2 3 5 4 - need to update the right part minor
public class QuickSortRec {
    public static void main(String[] args) {
        int[] arr = {3,1,4,5,2};
        int n = arr.length;
        int s = 0;
        int e = n-1;
        quickSort(arr,s,e);
        for(int k:arr){
            System.out.print(" "+k);
        }
    }

    public static void quickSort(int[] arr , int s, int e){
        //base case if arr is null or single element.
        if(s >= e){
            return;
        }

       int p =  partition(arr,s);
       swap(arr,p,0);

       int i = 0;
       int j = arr.length - 1;

       while(i<=j){
           if(arr[i]< arr[j]){
               i++;
           }

           if(arr[j]>arr[i]){
               j--;
           }
           if(arr[i]>arr[j]){
               swap(arr,i,j);
           }
           i++;
           j--;
       }

      //  quickSort(arr,s,p-1);
        quickSort(arr,p+1,e);
        quickSort(arr,s,p-1);
    }

    public static int partition(int[] arr, int s){
        int pivot = arr[s];
        //count all element less than pivot on the array
        int pivotIndex = 0;

        for(int y: arr){
            if(y < pivot){
                pivotIndex++;
            }
        }
        return pivotIndex;
    }

    public static void swap(int[] arr, int pivotIndex, int pivot){
        int t = arr[pivot];
        arr[pivot] = arr[pivotIndex];
        arr[pivotIndex] = t;
    }
}
