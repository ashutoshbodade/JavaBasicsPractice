package patterns_part_1;

import java.util.Scanner;

public class InvertedStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of stars :");

        int starNumber = sc.nextInt();
        sc.close();

        //method1
        for (int i = starNumber;i>=1;i--){
            for (int j = i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println("");
        }

        //method2
        for (int i = 1;i<=starNumber;i++){
            for (int j = 1;j<=starNumber-i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}