package com.example.datastructurecompetive.Array;

// This program is to merge two sorted array
//Output: [1,2,3,4,5,6,7,9]
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9};
        int[] brr ={2,4,6};
        int n = arr.length;
        int m = brr.length;
        int[] crr = new int[n+m];
        mergeSortedArray(arr,n,brr,m,crr);
        print(crr);
    }

    public static void mergeSortedArray(int[] arr,int n ,int[] brr,int m,int[] crr){
        int i = 0; //starting index of arr
        int j = 0; //starting index of brr
        int k = 0; //starting index of crr
        while(i<n && j<m){
            if(arr[i]<brr[j]){
                crr[k++] = arr[i++];
            }else{
                crr[k++] = brr[j++];
            }
        }
        //copy longest array element to arr3 array
        while(i< n){
            crr[k++] = arr[i++];
        }

        //copy longest array element to arr3 array
        while(j< m){
            crr[k++] = brr[j++];
        }

    }

    public static void print(int[] crr){
        for(int e:crr){
               System.out.print(e+" ");
        }
    }
}
