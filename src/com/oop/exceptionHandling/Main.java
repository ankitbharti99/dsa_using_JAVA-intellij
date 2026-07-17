package com.oop.exceptionHandling;

public class Main {
    static void main() {
        int a = 11;
        int b = 0;

        String str = null;
        try{
//            divide(a,b);
//            int num = a/b;
//            System.out.println(str.length());
            String name = "Ankit";
            if(name.equals("Ankit")) {
            throw new MyException(name);
            }
        } catch (MyException e) {
            System.out.println("Name Ankit found!!!");
        }
        catch (NullPointerException e) {
            System.out.println("Null exception");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Will Always Run");
        }
    }

    //throw keyword is used to explicitily throw an exception
    static void divide(int a, int b) throws ArithmeticException{
        if(b==0) {
            throw new ArithmeticException("do not divide the number by zero");
        }
        return;
    }
}
