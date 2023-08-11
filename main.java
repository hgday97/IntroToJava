import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.HashMap;
import java.time.LocalDate;

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

class Switch {
    public static void main(String[] args) {
        String operation = "sum";
        int num1 = 4;
        int num2 = 5;
        switch (operation) {
            case "sum":
                System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
                break;
            case "sub":
                System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
                break;
            case "div":
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
                }
                break;
            default:
                System.out.printf("%s is not a support operation", operation);
        }
    }
}

class ArrayWork {
    public static void main(String[] args) {
        char vowels[] = new char[5];

        // a e i o u
        vowels[0] = 'a';
        vowels[1] = 'e'; 
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';

        // equally, you could do: char vowels[] = {'a', 'e', 'i', 'o', 'u'};

        System.out.println(vowels[2]); // Prints just the vowel
        System.out.println(Arrays.toString(vowels)); // Prints the whole vowels array

        char letters[] = {'u', 'x', 'i', 'a', 'b', 'y'};
        Arrays.sort(letters);  // This will sort alphabetically
        System.out.println(Arrays.toString(letters));

        char key = 'o';

        int foundItemIndex = Arrays.binarySearch(vowels, key);
        System.out.println(foundItemIndex); 

        // If you search for an item that is not in the array, you will get a negative numbet for the index
    }
}

class ForLoops{
    public static void main(String[] args) {
        for ( int number = 1; number <= 10; number++){
            System.out.println(number);
        }

        int number = 5;
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.printf("%d * %d = %d \n", number, multiplier, number * multiplier);
        }

        int numbers[] = {1,2,3,4,5};
        for (int num : numbers) {  // Another way of iterating in a for loop
            System.out.println(num);
        }
    }
}

class WhileLoops{
    public static void main(String[] args) {
        int number = 5;
        int multiplier = 1;

        while (multiplier <= 10) {  // while loop version of the for loop code
            System.out.printf("%d * %d = %d \n", number, multiplier, number * multiplier);
            multiplier++; 
        }
    }
}

class ArrayLists{
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(0);

        numbers.forEach(number-> {  // Lambda expression for Java
            System.out.println(number * 2);
        });

        // numbers.clear();

        System.out.println(numbers.toString());

        numbers.sort(Comparator.naturalOrder());

        System.out.println(numbers.toString());

        // You also have: numbers.size(), numbers.ccntains(Integer.valueOf(1)), 
    }
}

class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>(); // String & Int as we'll have subject and result

        examScores.put("Maths", 75);
        examScores.put("Sociology", 85);
        examScores.put("English", 80);

        examScores.putIfAbsent("Maths", 70); //  As maths is present above, it won't be updated

        System.out.println(examScores.toString());  // Remember, hashmaps are unordered, so end list might not be in same order as above

        System.out.println(examScores.getOrDefault("Reglion", -1));
        System.out.println(examScores.containsKey("Maths"));

        examScores.forEach((subject, score) -> {
            System.out.println(subject + ": " + score);
        });
    }
}

class ObjectOriented {
    public static void main(String[] args) {
        User youngerUser = new User();

        youngerUser.name = "Harry Day";
        youngerUser.birthDay = LocalDate.parse("1997-04-30"); // YYYYMMDD

        System.out.printf("%s was born back in %s", youngerUser.name, youngerUser.birthDay.toString());
    }
}


// TODO - Focus more on OOP