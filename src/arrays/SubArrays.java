package arrays;

public class SubArrays {
    public static void main(String[] args) {

        int[] numbers = {2,4,6,8,10};

        printSubArrays(numbers);

        int ts = numbers.length * (numbers.length+1) / 2; //total number of sub arrays
        System.out.println(ts);

    }

    public static void printSubArrays(int[] numbers) {
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {

           for (int j = i ;j<numbers.length;j++){
               int sum = 0;
               for (int k = i;k<=j;k++){
                   System.out.print(numbers[k]+" ");
                   sum += numbers[k];
               }
               System.out.println();
               //System.out.println("sum = "+sum);
               ts++;

               if(sum>maxSum){
                   maxSum = sum;
               }
               if(sum<minSum){
                   minSum = sum;
               }

           }
            System.out.println();

        }
        System.out.println("total subarrays = "+ts);
        System.out.println("minimum sum = "+minSum);
        System.out.println("maximum sum = "+maxSum);

    }


}
