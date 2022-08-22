package functions;

import java.util.Scanner;

public class FunOverloadingUsngParams {

    public static int sum(int a,int b){
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a :");
        int a = sc.nextInt();

        System.out.println("Enter number b :");
        int b = sc.nextInt();

        System.out.println("Enter number c :");
        int c= sc.nextInt();

        sc.close();


        System.out.println("a+b= " + sum(a,b));
        System.out.println("a+b+c= " + sum(a,b,c));


    }
}
