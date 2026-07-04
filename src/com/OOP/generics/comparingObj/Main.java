package com.OOP.generics.comparingObj;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    static void main() {
        Student ankit = new Student(23,88.58f);
        Student kunal = new Student(21,81.56f);
        Student jigyasha = new Student(22,79.33f);
        Student richa = new Student(23,91.6f);
        Student anshika = new Student(20,66.56f);
        Student anushka = new Student(25,98.5f);
        Student shreya = new Student(22,80.48f);


//        if(ankit > kunal) {   //We can't directly compare objects as compiler confused which value to compare so we have to implement Comparable interface.
//            System.out.println("Ankit is winner");
//        }

//        if(ankit.compareTo(kunal) < 0) {
//            System.out.println(ankit.compareTo(kunal));
//            System.out.println("Kunal is Winner");
//        }

        Student[] list = {ankit,jigyasha,richa,anushka,anshika,kunal,shreya};
        System.out.println(Arrays.toString(list));

//        Arrays.sort(list, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
////                return (int)(o1.marks - o2.marks);  //for ascending
//                return -(int)(o1.marks - o2.marks);   //for descending
//            }
//        });   OR

        Arrays.sort(list, (o1, o2) -> (int)(o1.marks - o2.marks));   //for ascending
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, (o1, o2) -> -(int)(o1.marks - o2.marks));   //for descending
        System.out.println(Arrays.toString(list));

        }

    }
