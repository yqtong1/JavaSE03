package com.yqt.oo;

import java.util.Objects;

/**
 * Author yqt
 */
public class Person {
    private int age;;
    private String name;
    private String ID;

    public Person() {

    }

    public Person(int age, String name, String ID) {
        this.age = age;
        this.name = name;
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(ID, person.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, ID);
    }
}
