package com.yqt.practice;

/**
 * Author yqt
 */
public class ThisTest {

    //实例变量（引用.的方式访问）
    int num = 10;

    //带有static的方法
    //JVM负责调用main方法，JVM怎么调用的？
    //ThisTest.main(String[]);
    public static void main(String[] args) {

        //没有当前对象this

        //访问"当前对象"的num属性
        //System.out.println(num);//编译错误

        //System.out.println(this.num);//编译错误

        //想访问num怎么办？
        ThisTest tt = new ThisTest();
        System.out.println(tt.num);
    }
}
