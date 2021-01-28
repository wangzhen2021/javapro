package com.itheima_泛型;

import java.util.ArrayList;

/**
 * 自定义泛型类 建议使用 E ,T, K, V
 * 泛型的核心思想：是把出现泛型变量的地方全部替换成真实的数据类型
 */
public class GenericityDemo01 {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("Java");
//        list.add(262);
        list.remove("Java");
        list.add("mysql");
        System.out.println(list);

    }
}

class MyArrayList<E> {

    private ArrayList list = new ArrayList();

    public void add(E e) {
        list.add(e);

    }

    public void remove(E e) {
        list.remove(e);
    }

    @Override
    public String toString() {
        return list.toString();
    }
}