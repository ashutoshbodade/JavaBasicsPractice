package patterns_part_1;

import java.util.*;

public class NestedLoopsStarPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of stars :");

        int starNumber = sc.nextInt();
        sc.close();

        for (int i = 1;i<=starNumber;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}