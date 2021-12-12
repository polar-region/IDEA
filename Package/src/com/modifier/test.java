package com.modifier;


public class test {
    public static void main(String[] args) {
        A a = new A();
        //不能访问a的private类
        a.m1();
        a.m2();
        a.m3();

        B b = new B();
        b.say();
    }
}
