package com.ankit;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

//        for (int i = 0 ; i < 8; i++) {
//            String val = sc.next();
//
//            ArrayList<String> subVal = new ArrayList<>();
//            subVal.add(val);
//            list.add(subVal);
//        }
                       //                  OR            //
//        ArrayList<Integer> subList1 = new ArrayList<>();
//        subList1.add(23);
//        subList1.add(7);
//        subList1.add(2002);
//        list.add(subList1);
//
//        ArrayList<Integer> subList2 = new ArrayList<>();
//        subList2.add(24);
//        subList2.add(7);
//        subList2.add(2003);
//        list.add(subList2);
                         //                OR           //

        for(int i=0;i<3;i++) {
            list.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}
