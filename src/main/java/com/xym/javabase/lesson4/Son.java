package com.xym.javabase.lesson4;

/**
 * 描述类作用
 *
 * @author xym
 * @create 2019-07-13 21:17
 */
public class Son extends Father {
    //儿子自己独有的工作
    private String work;

    public Son() {
        //super();
    }

    /**
     * 方法的重写
     */
    @Override
    protected void showJiaChan() {
        System.out.println("son--" + jiachan);
    }

    public Son(String name, int age, long jiachan, String work) {
        super(name, age, jiachan);
        this.work = work;
    }

    @Override
    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jiachan=" + jiachan +
                '}';
    }
}
