package com.xym.javabase.lesson4;

/**
 * 描述类作用
 *
 * @author xym
 * @create 2019-07-13 21:56
 */
public class Car implements Runable {
    @Override
    public void run() {
        System.out.println("汽车用车轮跑");
    }
}
