public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        
        // Declaring a variable -> [Data Type] [Variable name (identifier)] [=] [value]
        // int x = 0;
        // x = 22;

        // // char hello = 'h';
        // String hello = "hello";
        // // int decimal = 1.25; // This will throw a type mismatch error 
        // float flo = 1.2f;
        // System.out.println(hello.length());

        String name = "Corey Mckeel";
        String favColor = "Aquamarine";
        int age = 29;
        boolean isHungry = true;

        // String message = "Hi my name is " + name + " and I am " + age + " Years old. " + "I am hungry, this is " + isHungry;
        // String message2 = String.format("Hi my name is %s and I am %d years old.", name, age);
        // System.out.println(message);
        // System.out.println(message2);
        // System.out.printf("Name: %s %n Age: %d%n Favorite Color: %s%n", name, age, favColor  );

        // if (isHungry && name.length() <= 5 ) {
        //     System.out.println("I am hungry");
        // } else {
        //     System.out.println("I am full");
        // }

        // Operators +, -, *, /, ++, +=, --, -=,*=, /= %
        // Logical operators &&, ||

        greeting();
        greeting("Jessica");
        greeting("Jonathan", "MERN");
        greeting("Betiel", "Java");
        add(2,2);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }

    // Void means it will not require a returned value
    public static void greeting() {
        System.out.println("Hello! Welcome to java!");
    }

    // Overloading methods
    public static void greeting(String name) {
        System.out.printf("Welcome to Java, %s%n", name);
    }

    public static void greeting(String name, String stack) {
        if (stack == "Java") {
            System.out.printf("Hello %s, Welcome to %s%n", name, stack);
        } else {
            System.out.println("Uh, you seem to be in the wrong stack");

        }
    }

    // This method will be looking for a int as a returned value
    public static int add(int a, int b) {
        System.out.println(a+b);
        return a + b;
    }
}