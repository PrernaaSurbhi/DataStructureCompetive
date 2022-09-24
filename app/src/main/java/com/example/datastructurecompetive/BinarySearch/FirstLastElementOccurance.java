package com.example.datastructurecompetive.BinarySearch;

//This program is to find last and first occurance of element in a array.
//output
//last occurance of 3 is at index 5
//first occurance of 3 is at index 2

public class FirstLastElementOccurance {
    public static void main(String[] args) {
        //even number of array
        int[] arr = {1,2,3,3,3, 3,5};
        int n = arr.length;
        lastOccurance(3,arr,n);
        System.out.println("last occurance of 3 is at index "+lastOccurance(3,arr,n));

        firstOccuranceElement(3,arr,n);
        System.out.println("first occurance of 3 is at index "+firstOccuranceElement(3,arr,n));
    }

    public static int lastOccurance(int key, int[] arr,int n){
        int ans = -1;
        int s = 0;
        int e = n-1;
        int mid = s+(e-s)/2;

        while(s<= e){
            if(arr[mid] == key){
                ans = mid;
                s = mid +1;
            }
            else if(key> arr[mid]){
                s = mid+1;
            }else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }

    public static int firstOccuranceElement(int key, int[] arr,int n){
        int ans = -1;
        int s = 0;
        int e = n-1;
        int mid = s+(e-s)/2;

        while(s<= e){
            if(arr[mid] == key){
                ans = mid;
                e = mid - 1;
            }
            else if(key> arr[mid]){
                s = mid+1;
            }else if((key < arr[mid])){
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }
        return ans;
    }
}
