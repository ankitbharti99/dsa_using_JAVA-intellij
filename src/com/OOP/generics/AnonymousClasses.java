package com.OOP.generics;

public class AnonymousClasses {

    // Functional Interface   -- such interface which have only 1 abstract method
    interface Operation {
        int operation(int a, int b);
    }

    // -------------------------------
    // 1. Normal Named Class
    // -------------------------------
    static class Add implements Operation {

        @Override
        public int operation(int a, int b) {
            return a + b;
        }
    }

    static void main() {

        // Using a Normal Named Class
        Operation add = new Add();

        System.out.println("Named Class:");
        System.out.println(add.operation(10, 20));


        // Anonymous Class  -- There is no class name. That's why it's called an anonymous class.
        Operation subtraction = new Operation() {
            public int operation(int a, int b) {
                return a-b;
            }
        };

        System.out.println("\nAnonymous Class:");
        System.out.println(subtraction.operation(10, 20));


        // Another Anonymous Class
        Operation multiply = new Operation() {

            @Override
            public int operation(int a, int b) {
                return a * b;
            }
        };

        System.out.println("\nAnother Anonymous Class:");
        System.out.println(multiply.operation(20, 5));



        // ==========================================
        // Anonymous Class with extra members
        // ==========================================
        Operation divide = new Operation() {

            int count = 0;

            @Override
            public int operation(int a, int b) {
                count++;
                System.out.println("Method called " + count + " time(s)");
                return a / b;
            }
        };

        System.out.println("\nAnonymous Class with fields:");
        System.out.println(divide.operation(20, 4));
        System.out.println(divide.operation(100, 5));



        // ==========================================
        // Lambda (Java 8+)
        // ==========================================
        Operation modulus = (a, b) -> a % b;

        System.out.println("\nLambda Expression:");
        System.out.println(modulus.operation(20, 6));
    }
/*
    You can imagine it as if Java secretly generated this:

    class SomeRandomName implements Operation {

        @Override
        public int operation(int a, int b) {
            return a + b;
        }
    }

    We never see SomeRandomName.
    Java creates it automatically.
 */
}
