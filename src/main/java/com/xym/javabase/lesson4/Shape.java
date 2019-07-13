package com.xym.javabase.lesson4;

/**
 * 形状抽象类，abstract关键字定义
 *
 * @author xym
 * @create 2019-07-13 22:28
 */
public abstract class Shape {

    protected double length;
    protected double width;

    public Shape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /**
     * 2个抽象方法
     */
    abstract double area();

    abstract void print(String src);

    /**
     * 正常的实现方法
     *
     * @param a
     */
    public void print(int a) {
        System.out.println(a);
    }

}
