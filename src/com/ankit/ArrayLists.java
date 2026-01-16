package com.ankit;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> marks= new ArrayList<>(10);
        marks.add("default");
        marks.add(null);
        marks.add("hello");
        marks.add("false");
        marks.add(null);
        marks.add("hii");
        marks.add("go");
        marks.add("where");
        marks.add("89");
        marks.add("&");
        marks.add("10");

        System.out.println(marks);
        marks.set(0,"changed");
        marks.remove(1);
        System.out.println(marks);

        //input
        for(int i=0;i<5;i++) {
            marks.add(sc.next());
        }

        //output
        for(int i=0;i<5;i++) {
            System.out.println(marks.get(i)); //pass index here. marks[i] will not work here.
        }
    }
}
