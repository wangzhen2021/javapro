package com.itheima_泛型接口;

public class Student implements E<Student>{
    @Override
    public void add(Student stu) {
        System.out.println("增加学生");
    }

    @Override
    public void delete(Student stu) {
        System.out.println("删除学生");
    }

    @Override
    public void update(Student stu) {
        System.out.println("修改学生");

    }

    @Override
    public Student query(int id) {
        return  null;

    }
}
