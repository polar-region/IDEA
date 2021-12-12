package com.use;


import com.modifier.A;

public class testModifier {
    public static void main(String[] args) {
        A a = new A();
        //在不同包下只能访问public
        //但是不能访问 默认，protected，private
        System.out.println("n1 = "+ a.n1);

        a.m1();
        //只能访问public
    }
}
