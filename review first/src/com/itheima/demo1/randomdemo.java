package com.itheima.demo1;
import java.util.Random;

public class randomdemo {
    public static void main(String[] args) {
        Random r1=new Random();
        int number=r1.nextInt(10);
        System.out.println(number);
    }
}
