import java.util.Arrays;

public class StringExample {
    // String - data type for text
    // String - immutable, reference type -> store on heap
    public static void main(String[] args) {
        stringExample();
        System.out.println("=======");
        stringBuilder();
        System.out.println("=======");
        String name = "Eing";
        int exp = 3;
        String nationality = "Thai";

        String multilineString =
                """
                Hello
                    I'm Pannatad Soisup.
                You can call me Eing
                """;
        System.out.println(multilineString);
        // other utilities
        String [] strArray = {name, String.valueOf(exp), nationality};
        String joinWithCustomDelimeter = String.join("-",strArray);
        System.out.println(joinWithCustomDelimeter);
    }

    private static void stringExample() {
        String name = "Pannatad Soisup";
        System.out.println(name);
        // reassign
        name = "Mickey Mouse";
        System.out.println(name);
        // concatenation
        name = name.concat(" is pretty");
        System.out.println(name);
        // String - array of character
        char [] nameCharArray = name.toCharArray();
        System.out.println(Arrays.toString(nameCharArray));
        // String - has many utilyty methods
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        // Compare String - use equals
        String example1 = "Pan";
        String example2 = "pan";
        System.out.println(example1.equals(example2)); // false // case sensitive
        System.out.println(example1.equalsIgnoreCase(example2)); // true // case not sensitive
    }

    private static void stringBuilder() {
        // "name:exp:nationality" - target
        String name = "Eing";
        int exp = 3;
        String nationality = "Thai";
        String key = name + ":" +exp + ":" + nationality; // concat 4 times, generate in background

        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(":");
        sb.append(exp);
        sb.append(":");
        sb.append(nationality);
        String keyBySb = sb.toString(); // generate one time

        System.out.println(key);
        System.out.println(keyBySb);
    }
}
