package com.OOP;

public class Concept {
    static void main() {
        Student ankit = new Student(224,"Ankit Bharti", 87.56f);
        Student priyam = new Student();

//        ankit.roll = 23;
//        ankit.name = "Ankit Bharti";
//        ankit.marks = 86.87f;
        System.out.print(ankit.roll+ " ");
        System.out.print(ankit.name+ " ");
        System.out.println(ankit.marks+ " ");

        System.out.print(priyam.roll+ " ");
        System.out.print(priyam.name+ " ");
        System.out.println(priyam.marks);

        Student random = new Student(priyam);
        System.out.print(random.roll+ " ");
        System.out.print(random.name+ " ");
        System.out.println(random.marks);

        Student one = new Student();
        Student two = one;      //only copy of reference variable, pointing to same object.

        one.name = "I'm Iron Man";
        System.out.println(two.name);

    }

    static class Student{
        int roll;
        String name;
        float marks;

        Student () {
            roll = 198;
            name = "Priyam Baliyan";
            marks = 76.86f;
        }

//        Student () {
//            // this is how you call a constructor from another constructor
//            // internally: new Student (13, "default person", 100.0f);
//            this (13, "default person", 100.0f);
//        }

        Student(Student other) {
            this.roll = other.roll;
            this.name = other.name;
            this.marks = other.marks;
        }

        Student(int rno, String naam, float marks) {
            this.roll = rno;
            this.name = naam;
            this.marks = marks;
        }

    }
}
