package Week1.Session1.HelloWorld;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        String name = "Corey";
        String name2 = "Ian";
        byte num = 8;
        // int num1 = 1;
        float decimal = 1.5035f;

        String num1 = "Hello";
        System.out.printf("Hi my name is %s, and you are %s", name,name2 );
        System.out.println("Hi my name is " + name +   "I am number " + num1 );

        greeting("Rachel");
        greeting("Rachel", "Java");
        System.out.println(add(2,10));

        if (num > 10 && num < 80) {
            System.out.println("Its in the middle");
        } else if (num > 80) {
            System.out.println("It's a big number");
        } else {
            System.out.println("It's a small number");
        }

        String something = num > 10 ? "greater than" : "less than";
        System.out.println(something);



        for (int i = 0; i <= 255; i++) {
            System.out.println(i);
        }


    }

    public static void greeting(String name) {
        System.out.println("Hello, " + name);
    }

    public static void greeting(String name, String stack) {
        System.out.println("Hello, " + name + " Welcome to " + stack);
    }

    public static int add(int a,int b) {
        return a + b;
    }
}