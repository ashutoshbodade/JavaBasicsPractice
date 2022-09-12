package arrays;

public class LargestInArray {
    public static void main(String[] args){


        int[] numbers = {2,4,6,8,10,12,150,16};


        int largestNum = findLargest(numbers);
        int smallestNum = findSmallest(numbers);

        System.out.println("Largest in array is : "+largestNum);
        System.out.println("Smallest in array is : "+smallestNum);



    }

    public static int findLargest(int[] numbers){
        int largestNumber = Integer.MIN_VALUE; //-infinity

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] > largestNumber){
                largestNumber = numbers[i];
            }
        }
        return largestNumber;
    }

    public static int findSmallest(int[] numbers){
        int smallestNumber = Integer.MAX_VALUE; //+infinity

        for(int i=0;i<numbers.length;i++){
            if(numbers[i] < smallestNumber){
                smallestNumber = numbers[i];
            }
        }
        return smallestNumber;
    }
}
