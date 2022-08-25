package patterns_part_2;

import java.util.Scanner;

public class HollowRhombus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number n :");
        int n = sc.nextInt();
        sc.close();

        for (int i=1;i<=n;i++){
          for(int j=1;j<=n-i;j++){
              System.out.print(" ");
          }
          for(int j=1;j<=n;j++){
              if(j==1 || i == 1 || i==n || j==n){
                  System.out.print("*");
              }
              else {
                  System.out.print(" ");
              }


          }
          System.out.println();
        }

    }
}