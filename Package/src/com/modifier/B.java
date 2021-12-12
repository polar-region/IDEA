package com.modifier;

public class B {
    public void say(){
        A a = new A();
        //在同一个包下只能访问protected,public和默认
        //private是无法访问的
        System.out.println("n1 = "+ a.n1+" "+"n2 = "+ a.n2+" "+"n3 = "+ a.n3);
    }
}
