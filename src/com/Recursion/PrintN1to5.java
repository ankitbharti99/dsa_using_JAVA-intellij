package com.Recursion;

public class PrintN1to5 {
    static void main() {
    int n=5;
    print(n);;
}

static void print(int n) {
    if (n == 0) {
        return;
    }
    print(n - 1);
    System.out.println(n);
}
}