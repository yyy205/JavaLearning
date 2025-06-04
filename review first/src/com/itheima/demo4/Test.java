package com.itheima.demo4;

public class Test {
    public static void main(String[] args) {
        Swim s1=new Swim() {
            @Override
            public void swimming() {
                System.out.println("游泳kuai");
            }
        };
        start(s1);
        Swim s2 = new Swim() {
            @Override
            public void swimming() {
                System.out.println("游泳慢");
            }
        };
        start(s2);
    }
    public static void start(Swim s) {
            s.swimming();
    }
}
