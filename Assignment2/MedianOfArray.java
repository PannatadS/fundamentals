package Assignment2;

import java.util.Arrays;

public class MedianOfArray {
    public static void main(String[] args) {
        int [] example1 = {5, 7, 8, 6, 3};
        System.out.println("Result: " + findMedian(example1));
        int [] example2 = {5, 7, 8, 6, 3, 1};
        System.out.println("Result: " + findMedian(example2));
        int [] example3 = {5};
        System.out.println("Result: " + findMedian(example3));
        int [] example4 = new int []{};
        System.out.println("Result: " + findMedian(example4));
    }

    private static double findMedian (int [] arr) {
        int length = arr.length;
        if (length == 0) {
            return 0;
        }
        if (length == 1) {
            return arr[0];
        }
        Arrays.sort(arr); // เรียงค่าน้อย - มาก
        boolean isEven = length % 2 == 0;
        // ถ้าจำนวนสมาชิกเป็นเลขคู่
        if (isEven) {
            return (arr[length / 2 - 1] + arr[length / 2]) / 2.0;
        }
        return arr[length / 2];
    }
}
