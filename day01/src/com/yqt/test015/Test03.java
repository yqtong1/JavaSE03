package com.yqt.test015;

/**
 * Author yqt
 */
public class Test03 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int retValue = sumInt(i,j);
        System.out.println(retValue);
    }

    public static int sumInt(int i, int j) {
        int c = i + j;
        int b = 15;
        int result = divide(c,b);
        return result;
    }

    public static int divide(int c, int b) {
        int a = c / b;
        return a;
    }


}
