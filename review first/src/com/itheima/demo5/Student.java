package com.itheima.demo5;
public class Student {
    String name;
    int age;

    //无参构造方法
    public Student() {
    }

    //有参构造方法
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //重写toString方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static int comparebyage(Student s1, Student s2) {
        return s1.getAge() - s2.getAge();
    }
}
