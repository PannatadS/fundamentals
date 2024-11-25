package Assignment;

import java.util.Scanner;

public class FactorialDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        String input = scanner.nextLine();
        int n = Integer.parseInt(input);

        int result = recursive(5);
        System.out.println("Result: " + result);
        // 5! = 5 * 4 * 3 * 2 * 1
        // 1! = 1, 0! = 1
//        if (n <= 1) {
//            System.out.println("Result: " + 1);
//            return;
//        }
//        int result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        System.out.println("Result: " + result);
    }

    private static int iterative1 (int n) {
        if (n <= 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static int recursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return recursive(n - 1) * n;
    }
}

