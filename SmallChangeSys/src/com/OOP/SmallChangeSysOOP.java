package com.OOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通的各个功能的类
 * 使用OOP(面向对象编程)
 * 将各个功能对应一个方法
 */
public class SmallChangeSysOOP {
    //定义相关的变量
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    //完成零钱通明细
    String details = "----------零钱通明细----------";

    //完成零钱通收益
    double money = 0;
    double balance = 0;
    Date date = null; //Data是java.util.Date类型 表示时间
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm"); //可以用于日期格式化的

    //消费
    //定义新变量 保存消费的原因
    String note ="";
    //先完成显示菜单,并可以选择
    public void mainMenu(){
        do {
            System.out.println("\n=========选择零钱通菜单=========");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退出系统");

            System.out.print("请选择(1-4):");
            key = scanner.next();

            //使用switch
            switch (key){
                case "1":
                    this.details();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }

        }while (loop);
    }

    //完成零钱通明细
    public void details(){
        System.out.println(details);
    }

    //完成收益入账
    public void income() {
        System.out.println("收益入账金额:");
        money = scanner.nextDouble();
        //money 的值的范围应该校验
        //找出不正确的情况 然后给出提示后 用break
        if (money <= 0) {
            System.out.println("收益入账金额 需要 大于 0");
            return; //退出方法 不再执行后面的代码
        }
        balance += money;
        //拼接收益入账信息到details
        date = new Date(); //获取当前的日期
        details += "\n收益入账"+"\t" + money + "\t" + sdf.format(date) + "\t余额:" + balance;
    }

    //完成消费
    public void pay(){
        System.out.println("收益入账金额:");
        money = scanner.nextDouble();
        //money 的值的范围应该校验
        if(money <= 0 || money>balance){
            System.out.println("消费金额 应该在 0-"+balance);
            return;
        }
        System.out.println("消费说明:");
        note = scanner.next();
        balance -= money;
        //拼接收益入账信息到details
        date = new Date(); //获取当前的日期
        details += "\n"+note+"\t-"+ money+"\t"+sdf.format(date)+"\t余额:"+balance;
    }

    //退出
    public void exit(){
        String choice = "";
        //用while循环进行判断是否是y/n
        while(true){
            System.out.println("你确定要退出吗? y/n");
            choice = scanner.next();
            if("y".equals(choice) || "n".equals(choice)){
                break;
            }
        }
        //退出while进行判断
        //如果是y 退出系统
        if(choice.equals("y")) {
            loop = false;
            return;
        }
        //如果是n 不进行任何操作
    }
}
