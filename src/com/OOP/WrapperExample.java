package com.OOP;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        swap(a, b);
//        System.out.println(a + " " + b);
//
//        Integer x = 10;
//        Integer y = 20;
//        swapUsingWrapper(x, y);
//        System.out.println(x + " " + y);   //still it will not change because wrapper class is written using final keyword

//        final A kunal = new A("Kunal Kushwaha");
//        kunal.name = "other name";

        // when a non primitive is final, you cannot reassign it.
//        kunal = new A("new object");

        A obj;
        for(int i=0;i<1000000;i++) {
            obj = new A("Kunal Kushwaha");
        }

    }

//    static void swap(int a, int b) {
//        int temp = a;
//        a = b;
//        b = temp;
//    }
//
//    static void swapUsingWrapper(Integer a, Integer b) {
//        Integer temp = a;
//        a = b;
//        b = temp;
//    }

    static class A {
        final int num = 10;
        String name;

        public A(String name) {
//        System.out.println("object created");
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed");
        }
    }
}