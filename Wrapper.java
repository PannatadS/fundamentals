public class Wrapper {
    public static void main(String[] args) {
        basicWrapper();
        parseTechnique();
    }

    public static void basicWrapper () {

        byte exampleOfByte = 127;
        // แปลงเป็น reference type
        Byte exampleOfByteBoxing = Byte.valueOf(exampleOfByte); // Boxing
        System.out.println(exampleOfByteBoxing.byteValue()); // Unboxing
        // Example of auto boxing
        Byte autoBoxing = exampleOfByte;
        // Example of auto unboxing
        System.out.println(exampleOfByteBoxing);

        short exampleOfShort = 100;
        Short shortData = 100;
        int exampleOfInteger = 100;
        Integer integerData = 100;
        long exampleOfLong = 100L;

        double exampleOfDouble = 25.00;
        float exampleOfFloat = 25.00f;

        char grade = 'D';
        Character grade2 = 'C';
        System.out.println(Character.toLowerCase(grade2)); // false

        Boolean isEnabled = true;
    }

    public static void parseTechnique () {
        // Auto unboxing -> Integer (wrapper) => int (primitive)
        Integer operand1 = Integer.parseInt("500");
        Integer operand2 = Integer.parseInt("100");
        System.out.println("Add: " + (operand1 + operand2));
    }
}
