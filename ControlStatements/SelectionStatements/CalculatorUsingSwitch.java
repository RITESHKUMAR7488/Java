import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        String yn;
        do{
            Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter Your Second Number");
        int b=sc.nextInt();
        System.out.println("Enter the Symbol");
        String c=sc.next();
        int res;

        switch(c){
            case "+" : res=a+b;
            System.out.println(res);
            break;

            case "-" : res=a-b;
            System.out.println(res);
            break;

            case "*" : res=a*b;
            System.out.println(res);
            break;

            case "/" : res=a/b;
            System.out.println(res);
            break;

            default : System.out.println("Invalid Symbol");
            break;
        }
        System.out.println("Do you want to continue? press y for yes n for no");
        yn=sc.next();
        }while(yn.equals("y")||yn.equals("Y"));
    }
    
}
