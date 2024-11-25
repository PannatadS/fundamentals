package Assignment;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String input = sc.nextLine();
        int n = Integer.parseInt(input);

        solution1(n);
        solution2(n);

//        if (n % 2 == 0) {
//            System.out.println(n + " is even.");
//        } else {
//            System.out.println(n + " is odd.");
//        }
    }

    private static void solution1(int n){
        if (n % 2 == 0) {
            System.out.println(n + " is even.");
        } else {
            System.out.println(n + " is odd.");
        }
    }

    public static void solution2 (int n) {
        String result = switch (n % 2) {
            case 0 -> "even";
            case 1 -> "odd";
            default -> "N/A";
        };
        System.out.println( n + " is " + result);
    }
}
