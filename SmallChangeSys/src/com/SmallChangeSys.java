package com;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {

    //1.先完成显示菜单,给出相应的提示
    public static void main(String[] args) {

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

        do {
            System.out.println("\n==========零钱通菜单==========");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退出系统");

            System.out.print("请选择(1-4):");
            key = scanner.next();

            //使用switch
            switch (key){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额:");
                    money = scanner.nextDouble();
                    //money 的值的范围应该校验
                    //找出不正确的情况 然后给出提示后 用break
                    if(money <= 0){
                        System.out.println("收益入账金额 需要 大于 0");
                        break;
                    }
                    balance += money;
                    //拼接收益入账信息到details
                    date = new Date(); //获取当前的日期
                    details += "\n收益入账"+"\t"+ money+"\t"+sdf.format(date)+"\t余额:"+balance;
                    break;
                case "3":
                    System.out.println("收益入账金额:");
                    money = scanner.nextDouble();
                    //money 的值的范围应该校验
                    if(money <= 0 || money>balance){
                        System.out.println("消费金额 应该在 0-"+balance);
                        break;
                    }
                    System.out.println("消费说明:");
                    note = scanner.next();
                    balance -= money;
                    //拼接收益入账信息到details
                    date = new Date(); //获取当前的日期
                    details += "\n"+note+"\t-"+ money+"\t"+sdf.format(date)+"\t余额:"+balance;
                    break;
                case "4":
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
                        break;
                    }
                    //如果是n 不进行任何操作
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }

        }while (loop);
        System.out.println("======退出了零钱通项目=====");
    }
}
