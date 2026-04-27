package ControlStatements.LoopingPrograms;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=8;
        int temp=0;
        for(int i=2;i<n-1;i++){
            if(n%i==0){
                temp++;
            }   
        }
        if (temp>0) {
            System.out.println("Not a Prime Number");
        }
        else{
         System.out.println("Prime Number");

        }

    }
    
}
