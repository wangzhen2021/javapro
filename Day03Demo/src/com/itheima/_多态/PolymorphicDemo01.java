package com.itheima._多态;

/**
 * 多态形式：
 * 父类类型  对象名称=new 子类构造器;
 * 接口     对象名称=new 实现类构造器;
 *
 * 概念：同一个类型的对象，执行同一个行为，在不同的状态下会表现不同的行为特征
 *
 *  多态的识别技巧：
 *  对于方法的调用 ：编译看左边，运行看右边。
 *  对于变量的调用：编译看左边 运行也看左边。
 *
 *  使用前提： 必须存在继承或者实现关系
 *           必须存在父类类型的变量引用子类类型的对象
 *           必须存在方法重写
 *
 * 多态的优劣势：
 * 优势：
 * 1.在多态形式下，右边对象可以实现组件化切换，业务功能也随之改变
 *   便于扩展和维护。可以实现类和类之前的解耦
 * 2. 实际开发的过程中，父类类型可以作为方法参数，传递给子类对象给方法
 * 可以传入一切子类对象进行方法的调用，更能体现出多态的扩展性和便利
 *
 * 劣势： 多态形式下，不能调用子类特有功能，编译看左！ 左边父类中
 * 没有子类独有的功能，所以代码再编译阶段就直接报错了！
 *
 */
public class PolymorphicDemo01 {
    public static void main(String[] args) {
        Animal c = new Cat();//多态  父类范围>子类范围
        c.run();
        Cat cat= (Cat) c;
        cat.eat();
        System.out.println(c.name);
        Animal d = new Dog(); //编译看左边 运行看右边
        d.run();
        Dog dog= (Dog) d;  //强转
        dog.eat();
        System.out.println(d.name);

    }
}
class Dog extends Animal {
    public  String name="狗狗名称";
    public void run() {
        System.out.println("狗狗跑！！");
    }
    public void eat() {
        System.out.println("吃骨头！");
    }


}
class Cat extends Animal {
    public  String name="猫猫名称";
    public void run() {
        System.out.println("猫猫跑！！");
    }
    public void eat() {
        System.out.println("吃鱼！");
    }
}
class Animal {
    public  String name="动物名称";
    public void run() {
        System.out.println("动物跑！！");
    }

}