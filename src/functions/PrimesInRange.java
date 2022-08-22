package functions;

import java.util.Scanner;

public class PrimesInRange {


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


    public static void primesInRange(int n){

        for (int i=2;i<=n;i++){
            if(isPrimeOptimized(i)){
                System.out.println(i+" ");
            }
        }
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number n :");
        int n = sc.nextInt();

        sc.close();

        primesInRange(n);



    }
}
