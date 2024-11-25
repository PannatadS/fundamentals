package Assignment3;

import java.util.Arrays;

public class ILoveEveryone {
    public static void main(String[] args) {
        String example = "aeioutestz";
        int [] amountArr = new int [26]; // 26 ตัวมาจาก lower case alphabet
        for (char c : example.toCharArray()) {
            amountArr[c - 'a']++;
        }
        System.out.println(Arrays.toString(amountArr));
    }
}
