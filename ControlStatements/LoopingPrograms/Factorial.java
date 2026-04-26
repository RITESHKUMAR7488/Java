package ControlStatements.LoopingPrograms;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number");
        int n=sc.nextInt();
        int a=1;
        int temp=1;
        while(a<n){
            temp=temp*a;
            a++;
            
        }
        System.out.print(temp);
        

    }
    
}
