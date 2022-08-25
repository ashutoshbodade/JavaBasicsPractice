package patterns_part_2;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter vertical no :");
        int verNum = sc.nextInt();

        System.out.println("Enter horizontal no :");
        int horNum = sc.nextInt();

        sc.close();

        for (int i=1;i<=verNum;i++){

            for (int j = 1; j <= horNum; j++) {
                if (i == 1 || i == verNum || j == 1 || j == horNum) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }




    }
}