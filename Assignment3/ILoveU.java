package Assignment3;

public class ILoveU {
    public static void main(String[] args) {
        String paragraph = "Hello, you are so beautiful";
        int count = 0;
        for (char u : paragraph.toCharArray()) {
            if (u == 'u' || u == 'U') {
                count++;
            }
        }
        System.out.println("u/U character in paragraph: " + count);
    }
}
