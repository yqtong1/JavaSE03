package com.yqt.test016;

/**
 * Author yqt
 */
public class Snake extends Pet {
    @Override
    public void eat() {
        System.out.println("蛇吞象！");
    }

    public void drink(){
        System.out.println("新增喝水功能");
    }
}
