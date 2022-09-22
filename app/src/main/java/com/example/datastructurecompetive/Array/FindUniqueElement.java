package com.example.datastructurecompetive.Array;

//This program is to find FindUniqueElement in a array
//concept used here is XOR - 1^1 = 0
//concept used here is XOR - 1^0 = 1
//output
//unique element in a array is :1
public class FindUniqueElement {
    public static void main(String[] args) {
        //create 2d array
        int[] arr = {2,3,1,6,3,6,2};
        findUniqueElement(arr);
        System.out.println("unique element in a array is :"+findUniqueElement(arr));
    }

    public static int findUniqueElement(int[] arr){
        int ans = 0;
        int n = arr.length;
        for(int i = 0 ; i < n;i++ ){
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
