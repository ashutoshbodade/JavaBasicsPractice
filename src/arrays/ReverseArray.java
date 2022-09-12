package arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        reverseWhile(numbers);

        //print reversed array
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }

    public static void reverse(int[] numbers) {
        for (int i = 0; i < numbers.length/2; i++) {

            int temp = numbers[i];

            numbers[i] = numbers[numbers.length-1-i];
            numbers[numbers.length-1-i] = temp;

        }
    }

    public static void reverseWhile(int[] numbers) {

        int first = 0;
        int last = numbers.length-1;

     while(first<last){
         int temp = numbers[last];
         numbers[last] = numbers[first];
         numbers[first] = temp;
         first ++;
         last --;
     }
    }
}
