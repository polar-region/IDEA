package com.Poly;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //animal的编译类型是Animal，可以指向(接收)com.Poly.Animal 的子类的对象
    //food的编译类型是Food，可以指向(接收)com.Poly.Food 的子类的对象
    public void feed(Animal animal,Food food){
        System.out.println("主人"+name+" 给 "+animal.getName()+" 吃 "+food.getName() );
    }

//    public void feed(com.Poly.Dog dog,com.Poly.Bone bone){
//        System.out.println("主人"+name+" 给 "+dog.getName()+" 吃 "+bone.getName() );
//    }
//
//    public void feed(com.Poly.Cat cat,com.Poly.Fish fish){
//        System.out.println("主人"+name+"给"+cat.getName()+"吃"+fish.getName());
//    }
}
