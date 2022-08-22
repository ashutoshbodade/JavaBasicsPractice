package functions;

import java.util.Scanner;

public class FunOverloadingUsngDataTypes {

    public static int sum(int a,int b){
        return a+b;
    }

    public static float sum(float a,float b){
        return a+b;
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a int :");
        int a = sc.nextInt();

        System.out.println("Enter number b int :");
        int b = sc.nextInt();

        System.out.println("Enter number c float :");
        float c= sc.nextFloat();

        System.out.println("Enter number d float :");
        float d= sc.nextFloat();

        sc.close();


        System.out.println("int a+b= " + sum(a,b));
        System.out.println("float a+b= " + sum(c,d));


    }
}
