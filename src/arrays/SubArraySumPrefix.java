package arrays;

public class SubArraySumPrefix {
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
        int[] prefix = new int[numbers.length];

        prefix[0] = numbers[0];
        //calculate prefix array
        for(int i=1;i<prefix.length;i++){
            prefix[i] = prefix[i-1]+numbers[i];
        }

        

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

           for (int j = i ;j<numbers.length;j++){
               int curSum = 0;
               int end = j;


               curSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
               ts++;

               if(curSum>maxSum){
                   maxSum = curSum;
               }
               if(curSum<minSum){
                   minSum = curSum;
               }

           }

        }
        System.out.println("total subarrays = "+ts);
        System.out.println("minimum sum = "+minSum);
        System.out.println("maximum sum = "+maxSum); // here time complexity is big of n qube (O(n^3))

    }


}
