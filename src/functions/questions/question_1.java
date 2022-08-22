package functions.questions;

import java.util.Scanner;

public class question_1 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a : ");
        int a = sc.nextInt();

        System.out.println("Enter number b : ");
        int b = sc.nextInt();

        System.out.println("Enter number c : ");
        int c = sc.nextInt();

        System.out.println(averageThree(a,b,c));

    }

    public static int averageThree(int a,int b, int c){
        return (a+b+c)/3;
    }

}
