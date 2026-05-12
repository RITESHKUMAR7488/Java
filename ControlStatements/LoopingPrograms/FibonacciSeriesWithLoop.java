package ControlStatements.LoopingPrograms;

import java.util.Scanner;

public class FibonacciSeriesWithLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number till you find Fibonacci");
        int n= sc.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=n-2;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
    
}
