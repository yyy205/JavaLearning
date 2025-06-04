package com.itheima.demo2;

public class Student {
    String name;
    public void print(){
        System.out.println(this);
        System.out.println(this.name);
    }
//说明了this关键字在变量名冲突的运用
    public void println(String name) {
        System.out.println(this.name+" is a student."+name);
    }
    public void next(String name) {
        System.out.println(name+" is a student."+name);
    }
}
