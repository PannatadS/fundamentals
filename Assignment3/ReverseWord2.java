package Assignment3;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWord2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String [] words = input.split(" ");
        // สร้าง array เก็บค่าที่ reverse ได้
        String [] reverseWord = new String [words.length];

        for (int i = 0; i < words.length; i++) {
            reverseWord[i] = reverse1(words[i]);
        }

        String result = String.join(" ", reverseWord);
        System.out.println("Reversed sentence by word: " + result);
    }

    private static String reverse1 (String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
