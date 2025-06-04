package com.itheima.demo3;

public class Test {
    public static void main(String[] args) {
    Student s1 = new Student("lisi", 18, 100);
    Student s2 = new Student("wangwu", 20, 99);
    Student s3 = new Student("zhaoliu", 19, 98);
    StudentOperator so = new StudentOperator();
    so.printscore(s1);
    so.printscore(s2);
    so.printscore(s3);
    }
}
