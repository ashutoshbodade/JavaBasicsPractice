package functions.questions;

import java.util.Scanner;

public class question_2 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number n : ");
        int n = sc.nextInt();

        if(isEven(n)){
            System.out.println("Number is Even.");
        }
        else
        {
            System.out.println("Number is Odd.");
        }

    }

    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        }
        else{
            return false;
        }
    }

}
