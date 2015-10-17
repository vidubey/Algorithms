package com.rashmi.algorithms.recursion;

import java.util.Scanner;

/**
 * Created by vidyakant.dubey on 17/10/15.
 */
public class FibonaciMemoization {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int A[] = new int[num];
        for(int i=0;i<num;i++){
            A[i] = -1;
        }
        A[0] = 0;
        A[1] = 1;
        fibonacci(A,num);

        for(int j=0;j<num;j++){

            System.out.println(A[j]);
        }
        System.out.println();

    }

    public static int fibonacci(int A[],int pos){

        if(A[pos]== -1){
             A[pos] = fibonacci(A,pos-1) + fibonacci(A,pos-2);
        }
        return A[pos];


    }
}
