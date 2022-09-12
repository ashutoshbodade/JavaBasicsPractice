package patterns_part_2;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number n :");
        int n = sc.nextInt();
        sc.close();

        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

          for(int j=1;j<=(i*2)-1;j++){
              System.out.print(i+" ");
          }

          System.out.println();
        }

    }
}