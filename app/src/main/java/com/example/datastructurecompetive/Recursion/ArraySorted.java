package com.example.datastructurecompetive.Recursion;

//This program is to find array sorted or not .
public class ArraySorted {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,13};
        System.out.println(isArraySorted(arr, 0));
    }

    public static boolean isArraySorted(int[] arr, int start){
        int size = arr.length -1;

       // base case
        if(size == 0 || start == size){
            return true;
        }

        //compare first two element
        if(arr[start] <= arr[start+1]){
            return isArraySorted(arr,start +1);
        }else{
            return false;
        }
    }
}
