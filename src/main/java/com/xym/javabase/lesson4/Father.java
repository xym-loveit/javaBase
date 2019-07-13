package com.xym.javabase.lesson4;

/**
 * 父类
 *
 * @author xym
 * @create 2019-07-13 21:15
 */
public class Father {
    //牙刷
    private String yashua;
    protected String name;
    protected int age;
    //家产
    protected long jiachan = 20000L;

    public Father(String name, int age, long jiachan) {
        this.name = name;
        this.age = age;
        this.jiachan = jiachan;
    }

    public Father() {
        System.out.println("fatcher----");
    }


    void showJiaChan() {
        System.out.println(jiachan);
    }
}
