package com.rashmi.algorithms.recursion;

import java.util.Scanner;

/**
 * Created by vidyakant.dubey on 17/10/15.
 */
public class Fibonacci {

    public static void main(String args[]){
        int num = 0;
        System.out.println("Pleas enter a number");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        for(int i=1;i<=num;i++){
            int result;
            result = fibonaci(i);
            System.out.println(result);
        }

    }


    public static int fibonaci(int number){
        if(number==1)
            return 0;
        else if(number == 2)
            return 1;
        else{
            return fibonaci(number-1) + fibonaci(number-2);
        }


    }
}
