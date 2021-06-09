package com.main;

public class Application {
    public static void main(String[] args) {
        printPattern5(5);
    }
    private static void printPattern5(int n) {
        for (int i = 1; i <= n; ++i) {
            System.out.println();
            printNoStartToEnd(1, n-(n-i));
            printNChars(n-i, '-');
        }
    }

    private static void printNoStartToEnd(int start, int end) {
        while(start <= end){
            System.out.print(start);
            ++start;
        }
    }
    private static void printNChars(int n, char ch) {
        while(n > 0){
            System.out.print(ch);
            --n;
        }
    }
}
