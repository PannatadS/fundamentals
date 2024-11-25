package Assignment2;

public class ArraySorted {
    public static void main(String[] args) {
        int [] expectedTrue = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Result: " + isAscSorted(expectedTrue));
        int [] expectedFalse = {1, 2, 3, 4, 6, 5, 7, 8, 9};
        // next element > previous element
        System.out.println("Result: " + isAscSorted(expectedFalse));
    }

    private static boolean isAscSorted (int [] arr) {
        // สำหรับ array ที่สมาชิก = 0 หรือ 1
        if (arr.length == 0 || arr.length == 1) {
            return true;
        }
        // ถ้าตัวปัจจุบัน มากกว่า ตัวซ้ายแสดงว่ายังไม่ได้ถูกเรียง
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int previousElement = arr[i-1];
            if (previousElement > currentElement) {
                return false;
            }
        }
        return true;
    }
}
