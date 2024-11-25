package Assignment;

import java.util.Scanner;

public class TriangleOrSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose shape to calcalate area:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter base of triangle: ");
            double base = Double.parseDouble(sc.nextLine());
            System.out.print("Enter height of triangle: ");
            double height = Double.parseDouble(sc.nextLine());
            triangleArea(base, height);
        } else if (choice == 2) {
            System.out.println("Enter side of square: ");
            int side = sc.nextInt();
            squareArea(side);
        } else {
            System.out.println("Invalid choice!");
        }
    }

    public static void triangleArea (double b, double h) {
        double result = 0.5 * b * h;
        System.out.println("Area of triangle = " + result);
    }

    public static void squareArea (int side) {
        int result = side * side;
        System.out.println("Area of square = " + result);
    }

}


