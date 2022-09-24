package com.example.datastructurecompetive.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//This is to find intersection of two array in java.
//union is : [9, 4]

public class IntersecOfTwoAr {
    public static void main(String[] args) {
        int[] arr = {4,9,5};
        int[] brr ={9,4,9,8,4};
        union(arr, brr);
        System.out.println("union is : "+ Arrays.toString(union(arr, brr)));
    }

    public static int[] union(int[] arr, int[] brr){
        ArrayList<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i :arr){
            set.add(i);
        }

        for(int j:brr){
            if(set.contains(j) && !result.contains(j)){
                result.add(j);
            }
        }

        int[] ans1 = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans1[i] = result.get(i);
        }
        return ans1;

    }

}


