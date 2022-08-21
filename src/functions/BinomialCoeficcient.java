package functions;

import java.util.Scanner;

public class BinomialCoeficcient {

    public static int fact(int n){
        int factorial = 1;

        for(int i=1;i<=n;i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int binCoeff(int n,int r){

        int fact_n = fact(n);
        int fact_r = fact(r);

        int fact_nmr = fact(n-r);

        int binCoefficient = fact_n / (fact_r*fact_nmr);

        return binCoefficient;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number n :");
        int n = sc.nextInt();

        System.out.println("Enter number r :");
        int r = sc.nextInt();

        sc.close();

        int binomialCoefficient = binCoeff(n,r);

        System.out.println("Binomial Coefficient is : " + binomialCoefficient);


    }
}
