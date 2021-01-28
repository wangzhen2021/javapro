package com.itheima._匿名内部类;

public class Demo01 {
    public static void main(String[] args) {
//        Swim sw = new Swim() {
//            @Override
//            public void swimming() {
//                System.out.println("游泳！！！！！！！");
//            }
//        };
        go(new Swim() {
            @Override
            public void swimming() {
                System.out.println("游泳~~~~~~~~！！！！！");
            }
        });

    }

    public static void go(Swim s) {
        System.out.println("开始.....");
        s.swimming();
        System.out.println("结束......");
    }
}

interface Swim {
    void swimming();
}