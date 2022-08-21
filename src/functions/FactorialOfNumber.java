package functions;

import java.util.Scanner;

public class FactorialOfNumber {

    public static int calculateFactorial(int n){
        int factorial = 1;

        for(int i=1;i<=n;i++){
            // factorial = factorial * i;
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");

        int number = sc.nextInt();

        System.out.println("factorial is : "+calculateFactorial(number));

        sc.close();
    }
}
