package com.itheima_泛型;

import java.util.ArrayList;

/**
 * 泛型是一个标签<数据类型>
 * 好处：
 *    可以在编译阶段约束只能操作某种数据类型
 *
 *泛型和集合都只支持引用数据类型 ，不支持数据类型
 *
 */

public class GenericityDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Java 哈哈哈");
//        list.add(151);
//        list.add(false);报错因为只能String字符串才可以
        System.out.println(list);

    }
}
