package functions;

import java.util.Scanner;

public class DecimalToBinary {


    public static void decToBinary(int decNum) {


        int quotient = decNum;

        int binNum = 0;

        int position = 1;


        while (quotient > 0) {
            binNum += ((quotient % 2) * position);
            quotient /= 2;
            position = position * 10;
        }

        System.out.println("Binary of " + decNum + " = " + binNum);

    }

    public static void decToBinaryOpt(int n) {

        int myNum = n;
        int binNum = 0;
        int pow = 0;

        while (n > 0) {
            int rem = n % 2;
            binNum += (rem * (int) Math.pow(10, pow));
            pow++;
            n /= 2;
        }

        System.out.println("Optimised Binary of " + myNum + " = " + binNum);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number n in decimal :");
        int n = sc.nextInt();

        sc.close();

        decToBinary(n);
        decToBinaryOpt(n);


    }
}
