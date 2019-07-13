package com.xym.javabase.lesson4;

/**
 * 能跑的接口
 *
 * @author xym
 * @create 2019-07-13 21:55
 */
public interface Runable {

    //接口里面定义的都是静态常量
    public static final double PI = Math.PI;
    double i = 3.14;

    void run();

    /**
     * 1.8之前接口中只能定义方法声明不能有实现主体
     * <p>
     * 从1.8开始接口可以有实现方法了：
     * <p>
     * 1、default关键字修饰的默认方法
     * <p>
     * 2、static关键字修饰的静态方法
     */
    default void print() {
        //PI = 100.0;
        //i = 100;
        System.out.println("------------");
    }

    static void print(String src) {
        System.out.println(src);
    }
}
