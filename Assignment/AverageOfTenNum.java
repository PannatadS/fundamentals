package Assignment;

import java.util.Scanner;

public class AverageOfTenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0.0;
        int n = 10;
        for (int i=0; i<10; i++) {
            System.out.print("Enter number: ");
            double input = sc.nextDouble();
            sum += input;
        }
        System.out.println("Average: " + sum/n);
    }
}
