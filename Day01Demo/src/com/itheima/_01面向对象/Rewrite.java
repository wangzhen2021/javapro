package com.itheima._01面向对象;
/**
重载：表示在同一个作用域内，具有相同名字的函数，它们返回值相同，但参数列表个数不同（类型不同or个数不同）

方法重写：子类重写父类中申明一样的方法覆盖父类的方法
方法重写建议加上@Override注解
方法的重写的核心要求是：方法名称形参列表必须与被重写方法一致！！

重载的作用是对于不同类型，不同操作数欲实现类似操作的函数定义
重写的作用是对于某一个父类函数，子类欲在其自己类中继承不同操作的同一函数



 */

public class Rewrite {
    public static void main(String[] args) {
        wolf wolf = new wolf();
        wolf.eat();

    }
}
class wolf extends Animal{

 @Override
    public void eat(){
        System.out.println("我是狼，吃肉");

    }

}
