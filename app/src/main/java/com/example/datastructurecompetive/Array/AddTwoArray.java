package com.example.datastructurecompetive.Array;
//find array sum of two array .
//Need to update this question
//Array to sum
//out expected 94456

public class AddTwoArray {
    public static void main(String[] args) {
        int[] arr = {9,3,4,6,8};
        int[] brr = {9,8,8};
        printArr(arr,brr);
    }

    public static void printArr(int[] arr,int[] brr){
        int n1 = arr.length;
        int n2 = brr.length;
        int c = 0;
        int s = 0;
        int[] ans = new int[Math.max(n1, n2)];

        int i = n1 - 1;
        int j = n2 -1;

        while (i >= 0 && j >= 0 ){
         int val1 = arr[i];
         int val2 = brr[j];

         int sum = val1+val2+c;

         c= sum/10;
         sum = sum % 10;

         ans[i] = sum;

         i--;
         j--;

        }

        for(int e :ans){
            System.out.print(e+" ;");
        }

    }
}
