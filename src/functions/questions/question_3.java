package functions.questions;

import java.util.Scanner;

public class question_3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number n : ");
        int n = sc.nextInt();

        if(isPalindrome(n,reverse(n))){
            System.out.println("Number is palindrome.");
        }
        else {
            System.out.println("Number is not palindrome.");
        }

    }

    public static boolean isPalindrome(int n, int rev_n){
        if(n==rev_n){
            return true;
        }
        else
        {
            return false;
        }
    }

    public static int reverse(int n){
        int rev = 0;

        while (n>0){

            int lastDigit = n % 10;

            rev = (rev*10) + lastDigit;

            n /= 10;

        }
        return rev;
    }

}
