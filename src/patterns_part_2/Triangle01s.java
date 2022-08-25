package patterns_part_2;

import java.util.Scanner;

public class Triangle01s {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no :");
        int n = sc.nextInt();


        for (int i=1;i<=n;i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(isEven(i+j));

            }
            System.out.println();
        }

    }

    public static int isEven(int n){
        if(n%2==0){
            return 1;
        }
        else{
            return 0;
        }
    }
}