package com.yqt.test016;

/**
 * Author yqt
 */
/*主人类*/
/*
 public class Master {
    /*
    *喂养宠物的方法
    * */
    /*
    public void feed(Cat c){
        c.eat();
    }
    public void feed(Dog d){
        d.eat();
    }
}*/
    //Master和Cat、Dog这两个类型的关联程度很强，耦合度很高。拓展能力差。

    //降低程序的耦合度【解耦合】，提高程序的拓展力【软件开发的一个很重要的目标】
 public class Master{

     //Master主人类面向的是一个抽象的pet，不再面向具体的宠物
    //提倡：面向抽象编程，不要面向具体编程
    //面向抽象编程的好处是：耦合度低，拓展力强
    public void feed(Pet pet){//Pet pet 是一个父类型的引用
        pet.eat();
    }
}
