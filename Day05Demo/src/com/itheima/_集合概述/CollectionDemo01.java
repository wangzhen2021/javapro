package com.itheima._集合概述;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * 集合是一个大小可变的容器，容器中的每个数据称为一个元素，数据==元素
 * 集合的特点是：类型可以不确定，大小不固定，集合有很多种，不同的集合特点和是使用场景也不同
 *              Collection <E>(接口)
 *              /             \
 *      Set<E>(接口)                List<E>(接口)
 *      /    \                  /    \
 * HashSet<E>   TreeSet<E>  ArrayList<E>  LinedList<E>
 *     /
 * LinkedHashSet<E>
 *
 *   Set系列集合：添加的元素是无序，不可重复 无索引
 *   --HashSet:添加的元素是无序，不可重复 无索引
 *   --LinkedHashSet:添加的元素是有序，不可重复 无索引
 *   --TreeSet:不可重复 无索引 按照大小升序排序
 *   List系列集合：添加的元素是有序，可重复，有索引
 *   --ArrayList:添加的元素是有序，可重复，有索引
 *   --LinedList:添加的元素是有序，可重复，有索引
 */

public class CollectionDemo01 {
    public static void main(String[] args) {
        Collection<String> set =new HashSet<>();
       //1.添加集合中的元素
        set.add("a");
        set.add("mysql");
        set.add("a");
        set.add("java");
        System.out.println(set);
        //2.清空集合的元素
//        set.clear();
//        System.out.println(set);
        //3.判断集合是否为空
        System.out.println(set.isEmpty());
        //4.获取集合的大小
        System.out.println(set.size());
        //5.判断集合是否包含某个元素
        System.out.println(set.contains("a"));
        //6.删除某个元素；默认删除前面的第一个；
        System.out.println(set.remove("java"));
        //7.把集合转换成数组
        Object[] obj = set.toArray();
        System.out.println("数组："+Arrays.toString(obj));

        ArrayList<String> list = new ArrayList<>();
        list.add("MyBatis");
        list.add("MyBatis");
        list.add("MyBatis");
        list.add("java");
        list.add("hh");
        System.out.println(list);

    }

}
