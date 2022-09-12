package arrays;

public class PairsInArray {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        pairsInArray(numbers);

        int tp = numbers.length * (numbers.length-1) / 2; //total number of pairs
        System.out.println(tp);

    }

    public static void pairsInArray(int[] numbers) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) {

           for (int j = i+1 ;j<numbers.length;j++){
               System.out.print("("+numbers[i]+","+numbers[j]+") ");
               tp++;
           }
            System.out.println();

        }
        System.out.println("Total pairs = "+tp);
    }


}
