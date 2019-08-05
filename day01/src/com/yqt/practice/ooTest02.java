package com.yqt.practice;

/**
 * Author yqt
 */
public class ooTest02 {

    //实例
    String name;

    //实例
    public void doSome(){
        System.out.println("do some!");
    }

    public static void main(String[] args) {
        //这里没有this
        /*编译错误
        System.out.println(name);
        doSome();

        System.out.println(this.name);
        this.doSome();
        */

        //编译通过
        ooTest02 oot = new ooTest02();
        System.out.println(oot.name);
        oot.doSome();
    }
}
