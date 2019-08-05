package com.yqt.test012;

/**
 * Author yqt
 */
public class ExtendsTest2 {
    public static void main(String[] args) {
        C c = new C();
        c.doSome();

    }
}
    class A{
        public void doSome(){
            System.out.println("do some!");
        }
    }
    class B extends A{

    }
    class C extends B{

    }
