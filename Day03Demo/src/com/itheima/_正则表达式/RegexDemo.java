package com.itheima._正则表达式;
//matches 正则表达式 用于校验

import java.util.Scanner;

public class RegexDemo {

    //校验
    public static void main(String[] args) {
//        System.out.println("8dsd12515".matches("\\d{6,}"));//{至少为几位？条件判断？}

        checkEmail();
    }


    //正则表达式的应用
    public static void checkEmail() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的邮箱:");
        String email = scanner.nextLine();
        //3232323@qq.com
        //dle0145@163.com
        //d16defs216@.com.cn
        if (email.matches("\\w{1,}@\\w{2,10}(\\.\\w{2,10}){1,2}")) {  //手机号的话就是"1".[3-9].\\d{8}
            System.out.println("邮箱合法了！！！");
        } else {
            System.err.println("邮箱格式不正确！！！");

        }
    }
}


