package arrays;

public class BinarySearchArray {
    public static void main(String[] args){


        int[] numbers = {2,4,6,8,10,12,14,16};
        int key = 100;

        int index = binarySearch(numbers,key);
        if(index == -1){
            System.out.println("NOT found");
        }
        else
        {
            System.out.println("Key is at index : "+index);
        }


    }

    public static int binarySearch(int[] numbers, int key){
        int start = 0;
        int end = numbers.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start = mid+1; //right search
            }
            else
            {
                end = mid -1; //left search
            }
        }

        return -1;
    }
}
