package com.xym.javabase.lesson4;

/**
 * 子类继承了抽象类，必须实现抽象类中的所有抽象方法
 * 否则子类也是抽象类
 *
 * @author xym
 * @create 2019-07-13 22:30
 */
public class Square extends Shape {

    /**
     * 构造方法.
     *
     * @param num  传递至构造方法的参数
     * @param num1 传递至构造方法的参数
     */
    public Square(final double num, final double num1) {
        super(num, num1);
        if (num != num1) {
            throw new IllegalArgumentException("正方形,长和宽必须相同");
        }
    }

    /**
     * 计算正方形的面积.
     *
     * @return double
     */
    @Override
    double area() {
        System.out.println("正方形的面积为");
        return length * width;
    }


    @Override
    void print(String src) {
        System.out.println(src);
    }
}
