package Assignment3;

public class HowManyDigit {
    public static void main(String[] args) {
        String paragraph = "zx6cxcxc81cc56as1 sdx8sssa"; // expected - 7
        int count = 0;
        for (char c : paragraph.toCharArray()) {
            if (Character.isDigit(c)) {
                count ++;
            }
        }
        System.out.println("Digit in paragraph: " + count);
    }
}
