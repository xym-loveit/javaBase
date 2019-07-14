package com.xym.javabase.lesson7;

import com.xym.javabase.lesson5.StudentException;

/**
 * 学生类
 *
 * @author xym
 * @create 2019-07-13 20:10
 */
public class Student {

    /**
     * 三个属性全是private(封装)
     */
    private String name;
    private int age;
    private String sex;

    /**
     * 无参数构造方法
     */
    public Student() {

    }

    public Student(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    /**
     * 无参数构造方法
     */
    public void Student() {
        System.out.println("-------普通方法---------");
    }

    /**
     * 访问（读操作）
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * 设置/修改（写操作）
     *
     * @param name
     */
    public void setName(String name) throws StudentException {
        if (name.equals("zhangsan") || name.equals("class")) {
            throw new StudentException("参数设置有误");
        }
        this.name = name;
        System.out.println("this=" + this);
    }

    public int getAge() {
        return age;
    }

    /**
     * 用方法封装对属性的访问可以更灵活控制我们的属性值
     *
     * @param age
     */
    public void setAge(int age) throws StudentException {
        if (age > 1 && age <= 120) {
            this.age = age;
        } else {
            throw new StudentException("年龄设置错误，范围在1到120之间");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 默认访问修饰符（什么都不加---只能允许同包访问）
     *
     * @param src
     */
    static void print(String src) {
        System.out.println(src);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
