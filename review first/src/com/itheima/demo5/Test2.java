package com.itheima.demo5;

import java.util.Arrays;

public class Test2 {
    //定义一个数组，来记录学生的信息
    public static void main(String[] args) {
        //创建学生对象
        Student[] students = new Student[3];
        students[0] = new Student("张三", 12);
        students[1] = new Student("李四", 19);
        students[2] = new Student("王五", 15);
//把学生数组按照年龄升序来排列
        //Arrays.sort(students , (s1, s2) -> {
            //return s1.getAge() - s2.getAge();
        //});
        //Arrays.sort(students , (s1, s2) -> s1.getAge() - s2.getAge());


        Arrays.sort(students , (Student::comparebyage));

        //遍历学生数组,通过数组输出学生年龄
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
