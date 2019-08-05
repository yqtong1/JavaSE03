package com.yqt.oo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Author yqt
 */
public class Test01 {


    public static void main(String[] args) {

        //把对象放到集合中
        List<Person> list = new ArrayList<>(10);
//      for循环快捷键：itli
        for (int i = 0; i < 10; i++) {
            Person person = new Person(i,"张三",i+"");
            list.add(person);
        }
        System.out.println(list.toString());

        //把对象放到map中
        Person person1 = new Person(0,"张三","");
        Map<String,Person> map = new HashMap<String,Person>();
        map.put("hello", person1);

        System.out.println(map.get("hello"));

        //把map放到集合中
        List<Map<String,Person>> mapList = new ArrayList<>();
        mapList.add(map);
        mapList.add(map);
        mapList.add(map);
        mapList.add(map);
        for (int i = 0; i < mapList.size(); i++) {
            Map<String, Person> stringPersonMap =  mapList.get(i);
            System.out.println(stringPersonMap.get("hello"));

        }


    }
}
