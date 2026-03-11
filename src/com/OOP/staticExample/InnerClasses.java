package com.OOP.staticExample;

//class Test {
//    static String name;
//
//    public Test(String name) {
//        Test.name = name;
//    }

public class InnerClasses {      //Outer classes cannot be static

    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    static void main(String[] args) {
        Test a = new Test("Ankit");
        Test b = new Test("Priyam");
//        System.out.println(a.name);
//        System.out.println(b.name);

        System.out.println(a);
    }
}
