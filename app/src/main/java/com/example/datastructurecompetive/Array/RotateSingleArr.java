package com.example.datastructurecompetive.Array;

//Given an array, rotate the array to the right by k steps, where k is non-negative.
//output
//5,6,7,1,2,3,4

public class RotateSingleArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        int n = arr.length;
        int i =0;
        reverseWhole(arr,n,i);
        print(arr);
        reverseFirstPart(arr, k,i);
        System.out.println("representing the arr after first half traversal");
        print(arr);
        reverseSecondPart(arr,k,n);
        System.out.println("representing the arr after second half traversal");
        print(arr);
    }

    public static void reverseWhole(int[] arr, int n, int i){
        int j = n-1;
        while((i <= j) && (j < n)){
            //rotate whole array
            rotate( i ,j , arr);
            i++;
            j--;
        }
    }

    public static void reverseFirstPart(int[] arr, int k, int i ){
        while(i< k){
            rotate( i ,k-1 , arr);
            i++;
            k--;
        }
    }

    public static void reverseSecondPart(int[] arr, int k,int n){
        while(k<n){
            rotate( k ,n-1 , arr);
            k++;
            n--;
        }
    }

    public static void print(int[] arr){
        for(int e:arr){
            System.out.print(e+" ");
        }
    }

    public static void rotate(int a , int b , int[]arr){
            int t = arr[a];
            arr[a]= arr[b];
            arr[b] = t;
    }
}
