package com.example.datastructurecompetive.Recursion;
//This program is to find fibnoncci of number
//output
//fib series is :21
public class Fibnocci {
    public static void main(String[] args) {
        int n = 8;
        fibnocci(n);
        System.out.println("fib series is :"+fibnocci(n));
    }

    public static int fibnocci(int n){
        if(n == 0){
            return 0;
        }
        if (n== 1){
            return 1;
        }
        int ans = fibnocci(n-1)+fibnocci(n-2);
        return  ans;
    }
}
