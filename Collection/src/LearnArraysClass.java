import java.util.Arrays;

public class LearnArraysClass {

    public static void main(String[] args) {

//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int index = Arrays.binarySearch(numbers, 4);
//        //for binarySearch to work, the array must be sorted
//        System.out.println("4 is at index " + index);

        Integer[] numbers = {10, 2, 32, 12, 15, 76, 17, 48, 79, 9};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Arrays.fill(numbers, 12);
        System.out.println(Arrays.toString(numbers));

    }
}
