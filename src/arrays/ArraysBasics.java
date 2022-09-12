package arrays;

import java.util.Scanner;

public class ArraysBasics {
    public static void main(String[] args){

        //creating an array
        int marks[] = new int[50];
        int numbers[] = {1,2,3,4,5};
        int moreNumbers[] = {6,4,8,9};
        String fruits[] = {"apple","mango","orange"};

        //input
        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        sc.close();

        //output
        System.out.println("phy : "+marks[0]);
        System.out.println("chem : "+marks[1]);
        System.out.println("math : "+marks[2]);

        //update
        marks[2] = 100;

        System.out.println("math updated : "+marks[2]);

        //length
        System.out.println("Length of array : "+marks.length);

    }
}
