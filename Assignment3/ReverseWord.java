package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        String input = "hello world test"; // expected - olleh dlrow tset
        String [] splitted = input.split(" ");
        String [] result = new String[splitted.length];

        for (int i = 0; i < result.length; i++) {
            String reversed = reverse(splitted[i]);
            result[i] = reversed;
        }
        System.out.println(String.join(" ", result));
    }

    private static String reverse(String word) {
        char [] arr = word.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return String.valueOf(arr);
    }
}
