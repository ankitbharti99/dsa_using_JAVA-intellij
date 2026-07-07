package com.OOP.generics;

import com.ankit.ArrayLists;

import java.util.ArrayList;
import java.util.function.Consumer;

//A lambda expression is a shorter way of writing an anonymous class for a functional interface.
public class LamdaFunctions {
    interface Operation{
        int operate(int a, int b);
    }

    static void main() {
/*    Instead of doing all this (mostly boiler plate things)
        Operation operate = new Operation() {
            @Override
            public int op(int a, int b) {
                return a+b;
            }
        };

        int Sum = operate.op(5,7);
        System.out.println(Sum);
*/

        Operation op = ((a, b) -> a + b);
        int sum = op.operate(2,7);
        System.out.println(sum);

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(i+1);
        }

//        list.forEach((item) -> System.out.print(item * 2 + " "));  //One line
// ------------SAME-----------
        Consumer<Integer> item2 = (item) -> System.out.println(item * 2 + " ");
        list.forEach(item2);


        Calculation add = (a ,b) -> a + b;
        Calculation sub = (a ,b) -> a - b;
        Calculation div = (a ,b) -> a / b;
        Calculation mul = (a ,b) -> a * b;
        System.out.println("-------Way 1------");
        int ans = add.calculation(8,5);
        int ans2 = sub.calculation(8,5);
        int ans3 = div.calculation(8,5);
        int ans4 = mul.calculation(8,5);
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
        System.out.println(ans4);


        LamdaFunctions myCalculator = new LamdaFunctions();
        System.out.println("-----------Way 2----------");
        System.out.println(myCalculator.calculate(8,5, add));
        System.out.println(myCalculator.calculate(8,5, sub));
        System.out.println(myCalculator.calculate(8,5, div));
        System.out.println(myCalculator.calculate(8,5, mul));
    }

    private int calculate(int m, int n, Calculation calc) {
        return calc.calculation(m,n);
    }
}

    interface Calculation{
        int calculation(int m, int n);
    }
