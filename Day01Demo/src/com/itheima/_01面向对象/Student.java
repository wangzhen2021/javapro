package com.itheima._01面向对象;
/**
    (1)静态成员变量：有static修饰，属于类本身与类一起加载一次，直接用类名访问即可
    (2)实例成员变量：无static修饰，属于类的每个对象的，必须先创建对象，再用对象来访问。
    小结：
    静态成员变量有static修饰，属于类的本身，与类加载一次，因为只有一份所以可以被类和类
    的对象共同调用。
    注意：不建议用对象访问静态成员变量，静态成员变量直接用类名访问即可！
    实例化成员变量，无static修饰，属于类的对象，必须先创建对象，然后用用对象来访问。

    静态方法属于类，有static修饰，直接用类名访问即可；
    实例方法属于对象，无static修饰，必须先创建对象，然后用对象来访问
    实例方法也属于被对象共同访问，但是不推荐，因为是静态方法直接用类名访问即可

     */

public class Student {
    public static String schoolName = "小明";
    private String name;
    private int age = 10;

    public static void inAddr() {
        System.out.println("我们都在天津");
    }

    public void eat() {
        System.out.println(name+"已经"+age+"岁"+"我们都在吃包子");
    }


    public static void main(String[] args) {
        System.out.println(Student.schoolName);
        Student student = new Student();
        student.name = "丽丽";
        System.out.println(student.name);
        System.out.println(student.age);
        student.eat();
        inAddr();

    }

}

