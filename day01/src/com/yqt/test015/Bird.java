package com.yqt.test015;

/**
 * Author yqt
 */
//鸟儿类
public class Bird extends Animal{
    @Override
    //重写从父类中继承过来的方法
    public void move() {
        System.out.println("鸟儿在飞翔！");
    }

    /*
    * 子类对象特有的行为/动作
    * */
    public void fly(){
        System.out.println("Bird fly");
    }
}
