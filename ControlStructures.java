public class ControlStructures {
    // Sequence
    // Selection
    // Iteration -> Try to solve same problem with difference input
    public static void main(String[] args) {
        simpleIfExample();
        line();
        validationByGuardClause(-3);
        line();
        ifElseExample(true);
        line();
        ifElseIfExample ();
        line();
        switchExample("Sunday");
        line();
        nestedIf(-100, true);
    }

    public static void line () {
        System.out.println("============");
    }

    public static void simpleIfExample () {
        int amount = 20;
        System.out.println("Step 1");
        // interruption
        if (amount > 10) {
            System.out.println("Wow! amount more than ten");
        }
        System.out.println("Step 2");
        System.out.println("Step 3");
    }

    public static void validationByGuardClause (int amount) {
        if (amount < 0) {
            System.out.println("This is negative number cannot proceed");
            return;
        }
        System.out.println("Accept amount: " + amount);
    }

    public static void ifElseExample (boolean isColdOutSide) {
        // Tank Top - Hot, Sweater - Cold
        String shirt = "";
        if (isColdOutSide) {
            shirt = "Sweater";
        } else {
            shirt = "Tank Top";
        }
        System.out.println("I need to wear " + shirt + " to go outside");
    }

    // Traffic light example - RED, YELLOW, GREEN, BLANK
    public static void ifElseIfExample () {
        int speed = 40;
        String light = "GREEN";
        if (light.equals("RED")) {
            speed = 0;
            System.out.println("Current speed: " + speed);
        } else if (light.equals("YELLOW")) {
            speed = 20;
            System.out.println("Current speed: " + speed);
        } else if (light.equals("GREEN")) {
            speed += 2;
            System.out.println("Current speed:" + speed);
        }
        // BLANK
    }

    // Weekday or Weekend or N/A
    public static void switchExample (String day) {
        // Put value that you need to check
        String result = switch (day) {
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
            case "Saturday", "Sunday" -> "Weekend";
            default -> "N/A";
        };
        System.out.println("Result "+result);
    }

    // validate input - log example
    private static void nestedIf (int amount, boolean isEnabledEmergency) {
        if (amount < 0) {
            System.out.println("We received negative amount: " + amount);
            // If emergency enable - we will contact support
            if (isEnabledEmergency) {
                System.out.println("Contact to support with topic: Received negative amount on system");
            }
        }
        System.out.println("Success on nestedIf");
    }
}
