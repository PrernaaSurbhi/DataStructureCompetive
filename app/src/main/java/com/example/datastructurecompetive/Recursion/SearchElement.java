package com.example.datastructurecompetive.Recursion;

//This program is to find element using binary search using recursion.
//output
//false.
public class SearchElement {
    public static void main(String[] args) {
        int[] arr = {2,4,6,10,14,18};
        int k = 1;
        int size = arr.length;
        System.out.println(findElement(arr, 0,size-1,k));
    }

    public static boolean findElement(int[] arr, int s, int e, int k){
        int mid = s+(e-s)/2;

        //base case element not found
        if(s>e){
            return false;
        }

        // base case element found
        if(arr[mid] == k){
            return true;
        }

        if(arr[mid] < k){
            //go right side
           return  findElement( arr, mid+1, e, k);
        }else {
            //go left side
          return  findElement( arr, s, mid -1, k);
        }

    }


}
