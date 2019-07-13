package com.xym.javabase.lesson3;

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
    private int sex;

    /**
     * 无参数构造方法
     */
    public Student() {

    }


    public Student(String name, int age, int sex) {
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
    public void setName(String name) {
        if (name.equals("zhangsan") || name.equals("class")) {
            throw new IllegalArgumentException("参数设置有误");
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
    public void setAge(int age) {
        if (age > 1 && age <= 120) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("年龄设置错误，范围在1到120之间");
        }
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
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
