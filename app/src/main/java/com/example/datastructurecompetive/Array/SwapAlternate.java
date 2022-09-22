package com.example.datastructurecompetive.Array;
//This program is to swap an alternate array element .
//output - 2,1,8,7,5
//output - 1,2,7,8,5
public class SwapAlternate {
    public static void main(String[] args) {
        //create 2d array
        int[] arr = {1, 2, 7, 8, 5,6};
        int[] brr = {2, 1, 8, 7, 5};

        System.out.println("swapping adjacent element on even number of array");
        swapEvenArray(arr);
        System.out.println("swapping adjacent element on odd number of array");
        swapOddArray(brr);
    }

    public static void swapEvenArray(int[] arr){
        int n = arr.length;

        for(int i=0; i < n; i+=2)
        {
            if (i + 1 == n)
            {
                break;
            }
            int temp = arr[i];
            arr[i]  = arr[i+1];
            arr[i+1]= temp;
        }
        printElement(arr);
    }



    public static void swapOddArray(int[] brr){
        int n = brr.length;

        for(int i=0; i < n; i+=2)
        {
            if (i + 1 == n)
            {
                break;
            }
            int temp = brr[i];
            brr[i]  = brr[i+1];
            brr[i+1]= temp;
        }
        printElement(brr);
    }

    public static void printElement(int[] krr){
        for(int e:krr){
            System.out.print(e+" ");
        }
    }


}
