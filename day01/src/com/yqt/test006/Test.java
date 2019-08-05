package com.yqt.test006;

/**
 * Author yqt
 */
public class Test {

    //没有static的变量
    int i = 10;

    //带有static的方法
    public static void method1(){
        //要求这里编写程序调用doSome
        //使用完整方式调用
        Test.doSome();
        //使用省略方式调用
        doSome();

        //要求这里编写程序调用doOther
        //使用完整方式调用
        Test t = new Test();
        t.doOther();
        //使用省略方式调用

        //访问i
        //使用完整方式访问
        System.out.println(t.i);
        //使用省略方式访问
    }

    //没有static的方法
    public void method2(){
        //要求这里编写程序调用doSome
        //使用完整方式调用
        Test.doSome();
        //使用省略方式调用
        doSome();

        //要求这里编写程序调用doOther
        //使用完整方式调用
        this.doOther();
        //使用省略方式调用
        doOther();

        //访问i
        //使用完整方式访问
        System.out.println(this.i);
        //使用省略方式访问
        System.out.println(i);
    }

    //主方法
    public static void main(String[] args) {
        //要求这里编写程序调用method1
        //使用完整方式调用
        Test.method1();
        //使用省略方式调用
        method1();

        //要求这里编写程序调用method2
        //使用完整方式调用
        Test tt = new Test();
        tt.method2();
        //使用省略方式调用

        //访问i
        //使用完整方式访问
        System.out.println(tt.i);
        //使用省略方式访问

    }

    //带有static的方法
    public static void doSome(){
        System.out.println("do some!");
    }

    //没有static的方法
    public void doOther() {
        System.out.println("do other");
    }

}
