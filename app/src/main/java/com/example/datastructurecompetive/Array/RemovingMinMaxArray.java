package com.example.datastructurecompetive.Array;


import java.util.ArrayList;
import java.util.Arrays;

// Removing Minimum and Maximum array index
//min element index is :5
//max element index is :1

public class RemovingMinMaxArray {
    public static void main(String[] args) {
        //create 2d array
        Integer[] arr = {0,-4,19,1,8,-2,-3,5};
        int min = minElementIndex(arr);
        System.out.println("min element index is :"+min);
        int max = maxElementIndex(arr);
        System.out.println("max element index is :"+maxElementIndex(arr));
        System.out.println("removing min max : "+removingMinMax(arr,min,max));
    }

    public static int minElementIndex(Integer[] arr){
        int min = Integer.MAX_VALUE;
        for(int k:arr){
            if(k<min){
                min = k;
            }
        }
        ArrayList<Integer>  list = new ArrayList<>(Arrays.asList(arr));
        int i = list.indexOf(min);
        return i;
    }

    public static int maxElementIndex(Integer[] arr){
        int max = Integer.MIN_VALUE;
        for(int k:arr){
            if(k>max){
                max = k;
            }
        }
        ArrayList<Integer>  list = new ArrayList<>(Arrays.asList(arr));
        int i = list.indexOf(max);
        return i;
    }

    public static int removingMinMax(Integer[] arr, int min, int max){
        int len = arr.length;
        return (max+1)+(len-min);
    }

}
