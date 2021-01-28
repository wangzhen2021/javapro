package com.itheima._01面向对象;
/**
类：是描述相同事物的共同特征的的抽象。
对象： 是具体存在的实例，是真实的 实例==对象
代码层面：必须要有类，才可以创建出对象

--类名的首字母应该大写，满足“驼峰写法”
--一个java代码文件中可以定义多个类，但是只能有一个类
是用public修饰的

类中成分的研究：
        类中有且仅有五大成分
      1.成员变量（Field:是描述类和对象属性信息的）
      2成员方法（Method：是描述类和对象的属性信息的）
      3构造器（Constructor：初始化一个类的对象并返回引用）
      4代码块
      5内部类

      this关键字代表了当前对象的引用。
      this关键字在实例方法和构造器中
      this在这个方法中， 谁调用这个方法 this就代表谁
      this用在构造器，代表了构造器正在初始化的那个对象的引用

      封装的作用：   提高安全性，可以实现代码的组件化。
      封装的规范：  1. 建议成员变量都私有，用private修饰
      private修饰的方法，成员变量，构造器等只能在本类中被直接访问
      2.提供成套的getter+setter方法暴露在成员变量的取值和赋值

          核心思想: 合理隐藏 ，合理暴露

 */

public class ClassDemo01{
    public static void main(String[] args) {
        Animal animal = new Animal("金毛",28,'母');
        System.out.println(animal);
    }
}
class Animal{
    private  String name;
    private  int age;
    private char sex;

    public Animal() {
    }
    public Animal(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }


public void eat(){
    System.out.println("吃食物");
}


    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

}