package com.itheima.demo4;

public class Test {
    public static void main(String[] args) {
        Swim s1 = () -> {
            System.out.println("游泳kuai");
        };
        startSwim(s1);
    }

    private static void startSwim(Swim s) {
        s.swimming();
    }
}
