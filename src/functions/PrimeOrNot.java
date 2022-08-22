package functions;

import java.util.Scanner;

public class PrimeOrNot {



    //only for n>=2
    public static boolean isPrime(int n){

       if(n==2){
           return true;
       }

        for(int i=2;i<=n-2;i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }

    public static boolean isPrimeOptimized(int n){

        if(n==2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number n :");
        int n = sc.nextInt();

        sc.close();

        System.out.println(isPrime(n));
        System.out.println(isPrimeOptimized(n));



    }
}
