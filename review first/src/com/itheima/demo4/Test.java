package com.itheima.demo4;

public class Test {
    public static void main(String[] args) {
        Swim s1 = () -> {
            System.out.println("游泳kuai");
        };
        s1.swimming();
    }
}
