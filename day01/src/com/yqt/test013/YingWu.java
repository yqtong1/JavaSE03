package com.yqt.test013;

/**
 * Author yqt
 */
public class YingWu extends Bird {
    @Override
    //这里move方法覆盖的是Bird当中的move方法
    public void move() {
        System.out.println("鹦鹉飞不起来！");
    }
}
