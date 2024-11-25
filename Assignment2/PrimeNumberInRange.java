package Assignment2;

import java.util.Scanner;

import static Assignment2.PrimeNumberUtil.isPrime;

public class PrimeNumberInRange {
    // concept - 1, กับตัวมันเอง หารลงตัว
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range number to find prime number: ");
        int endRange = Integer.parseInt(sc.nextLine());

        for (int n = 2; n <= endRange; n++) {
            boolean isCurrentNumberPrime = isPrime(n);
            if (isCurrentNumberPrime) {
                System.out.println(n + " is prime ✅");
            } else {
                System.out.println(n + " is not prime ❌");
            }
        }
    }
}
