package com.yqt.practice;

/**
 * Author yqt
 */

/*
*  最终结论：
*      在带有static的方法中不能“直接”访问实例变量和实例方法。
*      因为实例变量和实例方法都需要对象的存在。
*      而static的方法当中是没有this的，也就是说当前对象是不存在的。
*      自然也就无法访问当前对象的实例变量和实例方法。
* */
public class ooTest {

    //带有static关键字的主方法
    public static void main(String[] args) {

        //调用doSome方法
        ooTest.doSome();

        //调用doSome方法
        doSome();

        //调用doOther方法
        //编译错误
        //ooTest.doOther();//实例方法必须先创建对象，通过引用.的方式访问

        //doOther是实例方法
        //实例方法调用必须有对象的存在
        //以下代码的含义：调用当前对象的doOther方法
        //但是由于main方法中没有this，所以以下方法不能调用
        //doOther(); //编译错误
        //this.doOther();//编译错误

        ooTest oot = new ooTest();
        oot.doOther();
        oot.run();

    }

    public static void doSome() {
        System.out.println("do some!");
    }

    //实例方法
    public void doOther() {
        //this表示当前对象
        System.out.println("do other");
    }

    //run是实例方法，调用run方法的一定是有对象的存在的
    //一定是先创建了一个对象才能调用run方法
    public void run(){

        //在大括号的代码执行过程当中一定是存在“当前对象”的
        //也就是说这里一定有"this"的
        System.out.println("run execute!");

        //doOther();是一个实例方法，实例方法调用必须有对象的存在
        //以下代码表示的含义就是：调用当前对象的doOther方法
        doOther();//this.大部分情况下都是可以省略的
        //this.doOther();//是一个比较完整的写法
    }
}
