package com.PolyArray;

public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack",20);
        persons[1] = new Student("Lee",18,100);
        persons[2] = new Student("Lucy",20,45);
        persons[3] = new Teacher("Scout",30,2000);
        persons[4] = new Teacher("Dot",50,20000);

        //循环遍历这个多态数组 调用say方法
        for (int i = 0; i < 5; i++) {
            //persons[i] 编译类型是Person 运行类型根据实际情况改变
            System.out.println(persons[i].say());//动态绑定机制

            //类型判断 + 向下转型
            if(persons[i] instanceof Teacher){
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            }
            if(persons[i] instanceof Student) {
                Student student = (Student) persons[i];
            }
        }

    }
}
