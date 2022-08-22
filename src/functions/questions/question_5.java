package functions.questions;

import java.util.Scanner;

public class question_5 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number n : ");
        int n = sc.nextInt();

        System.out.println("Sum of "+n+" = "+sumOfN(n));

    }


    public static int sumOfN(int n){
        int sum = 0;

        for(int i=1;i<=n;i++){
            sum += i;
        }

        return sum;
    }

}
