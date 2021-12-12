package com;

public class Encapsulation01 {
        public static void main(String[] args){
            Person p = new Person();
            p.setAge(18);
            p.setJob("Teacher");
            p.name = "Lucy";
            p.setSalary(6000);
            System.out.println(p.info());
            Person Lee = new Person("Lee",18,20000,"Engineer");
            System.out.println(Lee.info());
        }
    }

    class Person {

        public String name; //name公开
        private int age; //age私有化
        private double salary; //salary私有化
        private String job; //job私有化
        //使用快捷键alt+insert-"getter and setter"
        //燃厚根据要求完成代码

        public Person (String name,int age,double salary,String job){
            setName(name);
            setAge(age);
            setSalary(salary);
            setJob(job);
        }

        public Person() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            // 加入判断
            if (name.length()>1&&name.length()<7){
                this.name = name;
            }
            else{
                System.out.println("输入的名字不符合要求，更改为默认值Lucy");
                this.name = "Lucy";
            }
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            // 加入对数据的判断
            if(age>=1&&age<=120){
                this.age = age;
            }
            else{
                System.out.println("输入的年龄不符合要求，更正为默认值18岁");
                this.age = 18;
            }
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getJob() {
            return job;
        }

        public void setJob(String job) {
            this.job = job;
        }

        //写一个方法，返回信息属性
        public String info(){
            return "信息为name="+ name +
                    " age=" + age + " salary=" + salary +" job="+job;
        }
}
