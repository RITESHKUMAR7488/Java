package ControlStatements.LoopingPrograms;

public class PrimeNumberBetweenOneToHundred {
    public static void main(String[] args){
        int n=2;
        while (n<=100) {
            int temp=0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    temp++;
                }

            }
            if(temp<=2){
                System.out.println(n);
            }
            n++;
        }
    }
    
}
