package com.example.datastructurecompetive.Array;
//This program is to move all zero to the right
//output [1,3,12,0,0]
public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0};
        move(arr);
    }

    public static void move(int[] arr){
        int i = 0;
        int j = 1;
        int n = arr.length;

        if(n <= 1){
            return;
        }

        while((i < n) && (n> 1) && (j< n)) {
            if ((arr[i] > 0) && (arr[j]==0)) {
                i++;
                j++;
            }
            if ((arr[i] > 0) && (j<n) && (arr[j] > 0)) {
                i++;
                j++;
            }

            else if((arr[i]==0) && (j< n)){
               if((arr[j] > 0)){
                   int t = arr[i];
                   arr[i] = arr[j];
                   arr[j] = t;
                   i++;
                   j++;
               }
               if((j< n) && (arr[j] == 0)){
                   j++;
                }
            }
        }

        for(int e:arr){
            System.out.print(e+" ");
        }
    }
}
