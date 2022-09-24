package com.example.datastructurecompetive.BinarySearch;

//This program is to find binary search on odd-even array
//element 12 found at index 4
//element 4 found odd at index 2

public class BinarySearchAlgo {
    public static void main(String[] args) {
        //even number of array
        int[] arr = {2,4,6,8,12,18};
        //odd number of array
        int[] brr ={2,3,4,10,40};
        int n = arr.length;
        int m = brr.length;
        searchEvenArray(n,arr,12);
        System.out.println("element 12 found at index "+searchEvenArray(n,arr,12));

        searchOddArray(m,brr,4);
        System.out.println("element 4 found odd at index "+searchOddArray(m,brr,4));
    }

    public static int searchEvenArray(int size,int [] arr, int key){
        return searchbinary(size,arr,key);
    }

    public static int searchOddArray(int size,int [] brr, int key){
        return searchbinary(size,brr,key);
    }
    public static int searchbinary(int size,int [] xrr, int key){
        int s = 0;
        int e = size - 1;
        int mid = s+(e-s)/2;

        while(s <= e){
            if(xrr[mid] == key){
                return mid;
            }
            if(key> mid){
                s = mid+1;
            }else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }
        return -1;
    }

}
