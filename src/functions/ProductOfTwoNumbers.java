package functions;

import java.util.Scanner;

public class ProductOfTwoNumbers {

    public static int calculateProduct(int num1,int num2){
        int product = num1*num2;
        return product;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();

        int prod = calculateProduct(a,b);

        System.out.println("Product is : "+prod);

        sc.close();
    }
}
