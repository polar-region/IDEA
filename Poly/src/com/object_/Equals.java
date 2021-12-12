package com.object_;

public class Equals {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a==b);
        System.out.println(b==c);
        B bobj = a;
        System.out.println(bobj == a);
        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);
    }
}

class A extends B{}
class B{}
