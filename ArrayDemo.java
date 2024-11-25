import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class ArrayDemo {
    /*
       Array
       - Group of same type of element
       - Reserve memory in sequence
       - Array in Java is reference
    */

    public static void main(String[] args) {
        // dataType [] variableName = new int []; -> จอง memory
        // Reserve number of slots
        // Initialized with size
        // index start with 0 to 9 = size 10
        int [] numbers = new int [10];
        numbers[5] = 10; // assign value to index
        System.out.println(numbers[5]); // access value by index

        // combined old array
        int [] exampleArray1 = new int [] {5, 2, 3, 4}; // size 4
        System.out.println(exampleArray1[2]);

        // Declare array with value
        String [] names = {"Eing", "Rose", "James", "Peter"};
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("=======");
        int [] exampleToShowUtility = {4, 7, 5, 8, 9, 6, 3, 2, 1};
        Arrays.sort(exampleToShowUtility); // Ascending order
        System.out.println(Arrays.toString(exampleToShowUtility));
        // Descending order
        reverse(exampleToShowUtility);
        System.out.println(Arrays.toString(exampleToShowUtility));
        // Use stream API
        exampleToShowUtility = new int [] {4, 7, 5, 8, 9, 6, 3, 2, 1};
        int [] descResult = Arrays.stream(exampleToShowUtility)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(descResult));
    }

    private static void reverse (int [] array) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left ++;
            right --;
        }
    }
}
