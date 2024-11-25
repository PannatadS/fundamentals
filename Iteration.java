import java.util.List;
import java.util.Random;

public class Iteration {
    public static void main(String[] args) {
        plainForLoop();
        line();
        whileLoop();
        line();
        doWhile();
        line();
        recursiveExample(5);
        line();
        forEachExample();
    }

    public static void line () {
        System.out.println("========");
    }

    // String concat
    public static void plainForLoop () {
        // Initialization, Condition, Updating
        String message = "";
        for (int n=1; n<=10; n++) {
            message += n + " ";
        }
        System.out.println("plainForLoop: " + message);
    }

    // Example Dice
    public static void whileLoop () {
        Random rand = new Random ();
        int dice = 1;
        int counter = 0;
        // check before do something
        while (dice != 4) {
            dice = rand.nextInt(6)+ 1 ;
            System.out.println("Dice: " + dice);
            counter++;
        }
        System.out.println("whileLoop dice amount until 4: " + counter);
    }

    public static void doWhile () {
        Random rand = new Random();
        int dice = 1;
        int counter = 0;
        do {
            dice = rand.nextInt(6) + 1;
            System.out.println("Dice: " + dice);
            counter ++;
        } while (dice != 4);
        System.out.println("doWhile dice amount until 4: " + counter);
    }

    public static int recursiveExample (int count) {
        if (count <= 0) {
            return 0;
        }
        int recursiveValue = recursiveExample(count - 1);
        System.out.println("recursiveValue: " + recursiveValue);
        return recursiveValue + 1;
    }

    // summation - target = 14
    public static void forEachExample () {
        int sum1 = 0;
        int [] exampleArray = new int [] {5, 2, 3, 4};
        for (int n : exampleArray) {
            sum1 += n;
        }
        System.out.println("sum1: " + sum1);

        int sum2 = 0;
        List<Integer> exampleList = List.of(5, 2, 3, 4);
        for (int n : exampleList) {
            sum2 += n;
        }
        System.out.println("sum2: " + sum2);
    }

}
