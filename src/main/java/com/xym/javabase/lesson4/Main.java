package com.xym.javabase.lesson4;

/**
 * 描述类作用
 *
 * @author xym
 * @create 2019-07-13 21:20
 */
public class Main {

    static int a = 100;

    public static void main(String[] args) {
        a = 101;
        //super.equals();
        //Main main = new Main();
        //System.out.println(Main.a);
        //Son son = new Son();
        //son.name = "wangwu";
        //son.jiachan = 2000L;
        ////System.out.println(son);
        //Father father = son;
        //father.showJiaChan();
        ////object 是最大的父类，所有类的父类
        //Object object = father;
        //Father father1 = new Father();
        //father1.showJiaChan();
        //System.out.println(father1 == son);
        //System.out.println(father == son);

        //print(123);
        //print("12345");
        //print(3.14F);
        //print("第一个字符串", "第二个字符串");

        Runable runable = new Car();
        runable.run();
        runable = new Student();
        runable.run();
        runable = new Tiger();
        runable.run();

        runable = new SubRunableImpl();
        runable.run();

        //System.out.println(Math.min(1, 5));
        //Main main = new Main();
        //Main.p2("-----------------");

        //new Shape();
        //Shape shape = new Square(20, 20);
        //System.out.println(shape.area());
    }

    /**
     * 方法的重载
     *
     * @param src
     */
    public static void print(String src) {
        System.out.println("打印字符串" + src);
    }

    public static void p2(String src) {
        System.out.println("打印字符串" + src);
    }

    public static void print(String src, String src2) {
        System.out.println("打印字符串" + src + "," + src2);
    }

    public static void print(int a) {
        System.out.println("打印数字" + a);
    }

    public static void print(float f) {
        System.out.println("打印小数" + f);
    }
}

