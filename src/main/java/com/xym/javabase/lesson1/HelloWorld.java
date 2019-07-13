package com.xym.javabase.lesson1;

/**
 * 演示
 *
 * @author xym
 * @create 2019-07-13 14:15
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Student a = new Student();
        System.out.println(a.age);
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}


class Student {
    /**
     * 年龄
     */
    int age = 100;
    //注释
    /*private String name;*/
    /*
   注释
   第二行
     */
    private String name;
}
