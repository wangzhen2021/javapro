package com.itheima_泛型接口;

public class STest {
    public static void main(String[] args) {
        Student student = new Student();
        student.add(new Student());
        student.delete(new Student());

        E<Teacher> teacher=new Teacher();
        teacher.add(new Teacher());
        teacher.delete(new Teacher());


    }
}
