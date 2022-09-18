package com.example.datastructurecompetive.Array;

import java.io.IOException;
import java.util.Scanner;

//Multiply Two Numbers Without Using Arithmetic Operator in Java
//trying to do multiplication of x * Y , without uising * operator
// 5*3  = 5+5+5 (5 into 3 times )
//5*3 = 3+3+3+3+3 (3 into 5 times )

//output
//enter first number: 3
//enter second number: 5
//multiplication of x and y is :15

public class Multiplication {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x , y ,sum = 0;
        System.out.print("enter first number: ");
        x = sc.nextInt();
        System.out.print("enter second number: ");
        y = sc.nextInt();
        multiply(x,y,sum);
        System.out.println("multiplication of x and y is :"+multiply(x,y,sum));
    }

    public static int multiply(int x, int y , int sum){
           for(int i = 1 ; i <= y; i++){
               sum = sum + x;
           }
           return sum;
    }

}
