public class Operators {
    public static void main(String[] args) {
        arithmetic();
        assignment();
        unary();
        ternary();
        bitwise();
    }

    public static void arithmetic () {
        var add = 10 + 10;
        var minus = 10 - 10;
        var multiply = 10 * 10;
        var divide = 10 / 10;
        var modulo = 89 % 10; // หารเอาเศษ
    }

    public static void relational () {
        // relation or comparison
        var isEqual = 10 == 10;
        var isNotEqual = 10 != 10;
    }

    public static void logical () {
        int score = 85;
        boolean isScoreGreaterThanEqualZeo = score >= 0;
        double day = 23;
        boolean isGoToMall = (day >= 5 && day <= 10) || (day >= 20 && day <= 25);
        // Java Short circuit
        // AND ถ้า ฝั่งซ้ายเป็น False จะ False เลย
        // OR ถ้า ฝั่งซ้ายเป็น True จะ True เลย
    }

    public static void assignment () {
        // assign value to variable
        int day = 25;
        // Combination arithmetic + assignment
        int amount = 20;
        amount += 10; // amount = amount + 10
        System.out.println("Current amount = " + amount);
    }

    public static void unary () {
        // incremental / decremental
        // ++, --
        // in front - ทำ
        // in back - ทำ
        int day = 10;
        int result = day++;
        System.out.println("result = "+ result);
        System.out.println("day = "+ day);
    }

    public static void ternary () {
        int score = 85;
        // If-Else
        // boolean isAGrade = score >= 80;
        String grade = score >= 80 ? "Pass" : "Not Pass";
        System.out.println(grade);
    }

    public static void bitwise () {
        // 4 bits แบบ unsigned 0-15
        int exampleValue1 = 7; // 111
        int exampleValue2 = 3; // 011
        // & bitwise AND
        System.out.println("AND: "+(exampleValue1 & exampleValue2));
        // | bitwise OR
        // ^ bitwise XOR
        // ~ bitwise complement
        // >> right shift



    }
}
