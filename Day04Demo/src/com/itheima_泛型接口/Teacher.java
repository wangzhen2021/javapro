package com.itheima_泛型接口;

public class Teacher implements E<Teacher>{
    @Override
    public void add(Teacher stu) {
        System.out.println("增加");
    }

    @Override
    public void delete(Teacher stu) {
        System.out.println("删除");
    }

    @Override
    public void update(Teacher stu) {
        System.out.println("修改");
    }

    @Override
    public Teacher query(int id) {
        return  null;

    }
}
