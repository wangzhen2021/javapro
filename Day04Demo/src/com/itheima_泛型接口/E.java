package com.itheima_泛型接口;

/**
 *   泛型接口的核心思想；在实现接口的时候传入真实的数据
 *   这样重写的方法说就是对该数类型的操作！
 * @param <E>
 */

public interface E<E> {
    void add (E stu);
    void delete (E stu);
    void update (E stu);
   E query(int id);
}
