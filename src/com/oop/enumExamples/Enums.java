package com.oop.enumExamples;

import java.util.Arrays;

public class Enums {

    static void main() {

        // Enum is a special data type that represents
        // a fixed set of predefined constants.
        // Java creates one object for each constant only once.

        enum Day {
            Monday,
            Tuesday,
            Wednesday,
            Thursday,
            Friday,
            Saturday,
            Sunday;

            Day() {
                System.out.println("Constructor called");
            }
        }

        // 'today' is a reference variable.
        // It does NOT create a new object.
        // It simply refers to the existing Day.Sunday object.
        Day today = Day.Sunday;

        // Prints the selected enum constant.
        // Output: Sunday
        System.out.println(today);

        // values() is an automatically generated method.
        // It returns an array containing all enum constants
        // in the order they were declared.
        // Output:
        // [Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday]
        System.out.println(Arrays.toString(Day.values()));

        // You can also access an enum by its index using ordinal().
        // Sunday is the 7th constant, so its index is 6.
        System.out.println(today.ordinal());   // Output: 6

        // Convert String to Enum.
        // The String must exactly match the enum constant name.
        Day d = Day.valueOf("Monday");
        System.out.println(d);                 // Output: Monday

        // Compare enums using == because each enum constant
        // is a singleton (only one object exists).
        System.out.println(today == Day.Sunday); // true

        // Invalid assignment (Compile-time Error)
        // today = Day.Holiday;

        // Invalid String assignment (Compile-time Error)
        // today = "Sunday";
    }
}
