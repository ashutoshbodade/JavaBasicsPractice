package patterns_part_1;

import java.util.Scanner;

public class HalfPyramidPatternNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number :");

        int n = sc.nextInt();
        sc.close();

        for (int i = 1;i<=n;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}