import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.print("Hello World!");
    }
}


class Types {

    static int age = 26; // This is a static variable - so it can be used inside the "main" method.
    // Types include: String, int, double, boolean, char, long (append l at end of integer), float, and void.
    public static void main(String[] args) {
        System.out.println("I am " + age + " years old.");
    }
}

class Operators {
    static int number1 = 5;
    static int number2 = 7;

    public static void main(String[] args) {
        // System.out.println(number1 + number2); // Addition
        // System.out.println(number1 - number2); // Substraction
        // System.out.println(number1 * number2); // Multiplication
        // System.out.println(number1 / number2); // Division (floor)
        // System.out.println(number1 % number2); // Remainder

        // // We also have <, >, <=, >=, !=
        // // For logical operators we have &&, ||, !
        // boolean bool1 = true;
        // boolean bool2 = false;
        // System.out.println(bool1 && bool2); // Logical AND
        // System.out.println(bool1 || bool2); // Logical OR
    }
}

class Strings {
    public static void main(String[] args) {

        // // Literal vs Object Strings
        // String literalString1 = "abc";
        // String literalString2 = "abc";
        // String objectString1 = new String("xyz");
        // String objectString2 = new String("xyz");
        // System.out.println(literalString1 == literalString2); // Returns true
        // System.out.println(objectString1 == objectString2); // Returns false

        String name = "Harry";
        int age = 26;
        String formattedString1 = String.format("My name is %s and I am %d years old.", name, age);
        // %s for string, %d for integer, %f for floating point number, %b for boolean, %c for character, %l for long integer
        // We also have .length(), .isEmpty(), .toUpperCase(), .equals(), .equalsIgnoreCase() and .replace(initial, replacement)
        System.out.println(formattedString1);

    }
}

class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // cleans up input buffer - need to use after anything but a nextline call
        scanner.nextLine();

        System.out.print("Enter your favorite number: ");
        int favourite = Integer.parseInt(scanner.nextLine());

        System.out.println(name + " is " + age + " years old. Your favourite number is " + favourite + ".");

        scanner.close();
    }
}

class Conditionals {
    public static void main(String[] args) {
        int i = 5;
        if (i < 10) {
            System.out.println("i is less than 10");
        } else if (i > 10) {
            System.out.println("i is greater than 10");
        } else {
            System.out.println("i is equal to 10");
        }
    }
}

// To Do - Switch cases