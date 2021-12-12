package com.Poly;

public class Poly01 {
    public static void main(String[] args) {
        Master master = new Master("汤姆");
        Dog dog = new Dog("大黄");
        Bone bone = new Bone("大棒骨");

        master.feed(dog,bone);

        Cat cat = new Cat("小花猫");
        Fish fish = new Fish("黄花鱼");

        master.feed(cat,fish);

        Pig pig = new Pig("小肥猪");
        Rice rice = new Rice("米饭");
        master.feed(pig,rice);
    }
}
