package com.yqt.test015;

/**
 * Author yqt
 */
//猫类
public class Cat extends Animal{
    @Override
    //重写父类中继承过来的move方法
    public void move() {
        System.out.println("猫在走猫步！");
    }

    //不是从父类中继承过来的方法
    //这个方法是子类对象特有的行为【不是说所有的动物都能抓老鼠！】
    public void catchMouse() {
        System.out.println("猫抓老鼠！");
    }
}
