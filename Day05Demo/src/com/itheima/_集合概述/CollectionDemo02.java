package com.itheima._集合概述;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**Collection集合的遍历：
 * 1.迭代器 iterator
 * ①得到迭代器的对象
 * ② hasNext 判断是否有下一个元素 （定义一个while循环问一次取一次值）
 * ③ E next 获取下一个元素值
 * 2.foreach
 * for(被遍历集合数组的类型  变量：被遍历集合数组)
 * 3.Lambda表达式
 */
public class CollectionDemo02 {
    public static void main(String[] args) {
        Collection<String> set =new HashSet<>();
        //1.添加集合中的元素
        set.add("mysql");
        set.add("a");
        set.add("java");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);   //iterator迭代器
        }
        for (String s : set) {
            System.out.println(s);  //foreach
        }
//        set.forEach(s -> System.out.println(s)); //lambda
//        set.forEach(System.out::println);
//        set.forEach(s -> {
//            System.out.println(s);
//        });
//
    }
}
