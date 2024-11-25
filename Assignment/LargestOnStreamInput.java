package Assignment;

import java.util.Scanner;

public class LargestOnStreamInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Largest number from stream of input
                Please type any integer to find largest value
                Note: Type 0 or any negative to stop stream
                """);
        String userInput;
        int largest = 0;
        while (true) {
            System.out.print("Number: ");
            userInput = sc.nextLine();
            // If input cannot pa
            int n = Integer.parseInt(userInput);
            if (n <= 0) {
                break;
            }
            if (n > largest) {
                largest = n;
                System.out.println("Largest number has changed to " + largest);
            }
        }
        System.out.println("Largest number from valid stream: " + largest);
    }
}
