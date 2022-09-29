package com.example.datastructurecompetive.Recursion;

//a person can climb either 1 or 2 stairs
//person has to reach bottom to destination.
//output
//34
public class climbStairs {
    public static void main(String[] args) {
        //n is total number of stairs.
        int n = 10;
        climb(n);
        System.out.print(climb(n)+" : ");
    }

    public static int climb(int n){
        //base condition
        if(n < 0){
            return -1;
        }

        //only a person can jump on zero stairs
        if(n == 0){
            return 1;
        }

        int ans = climb(n-1)+climb(n-2);
        return ans;
    }
}
