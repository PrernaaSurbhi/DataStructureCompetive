package com.example.datastructurecompetive.Array;

//This program is to reverse an odd and even  matrix element in a array .
//input - {1,4,0,5,-2,15}
//output - 15 -2 5 0 4 1
//output - 4 9 3 6 2

public class ReverseArray {
    public static void main(String[] args) {
        //create 2d array
        int[] arr = {1,4,0,5,-2,15};
        int[] brr = {2,6,3,9,4};

        reverseEvenArray(arr);
        System.out.println("reverse of odd array element is :");
        reverseOddArray(brr);

    }
    public static void reverseEvenArray(int[] arr){
        reverseArray(arr);
    }

    public static void reverseOddArray(int[] brr){
        reverseArray(brr);
    }

    public static void reverseArray(int[] x){
        int start = 0;
        int end = x.length -1;

        while(start <= end){
            int t;
            t = x[start];
            x[start] = x[end];
            x[end]=t;
            start++;
            end --;
        }

        for(int e:x){
            System.out.print(e+" ");
        }
    }
}
