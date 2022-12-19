package com.example.datastructurecompetive.Array;

import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {1, 8, 2, 9, 4, 6, 1, 3};
        int target = 11;
        System.out.println("min element index is :"+gettargetSum(arr,target));
    }

    public static boolean gettargetSum(int[] arr, int target){
        Arrays.sort(arr);

        System.out.println("The sorted array is: ");

        for(int k :arr){
            System.out.print(k+" ");
        }

        int start = 0;
        int end = arr.length-1;
        int sum = arr[start] + arr[end];

        while(start < end){
            if(sum == target){
                return true;
            }else if(sum <target) {
                start++;
            }else{
                end --;
            }
        }

        return false;

    }

}
