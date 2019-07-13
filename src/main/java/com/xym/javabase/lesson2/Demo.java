package com.xym.javabase.lesson2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 描述类作用
 *
 * @author xym
 * @create 2019-07-13 14:58
 */
public class Demo {
    //数据类型 标识符 = 初始化值s
    static int a = 10;
    int c = 100;
    int b = 100;
    //0开否表示8进制
    int d = 07;
    //[0-9]+[a-f]表示16进制
    int e = 0X9a;
    int f = 0X9F;
    int g = 0Xf8;
    //有小数点后面什么都没加都代表double
    double dd = 2.5;

    static char aa = 65;
    static char zhong = '中';
    static char guo = '国';
    static char guo2 = 22269;
    static char zhong2 = 20013;

    long aLong = a;
    static double aDouble = a;
    static float f1 = 3.14f;
    static int anInt = (int) f1;
    static int guoInt = guo;

    private static void test1() {

        int i = 100;
        int j = 2;
        int k = 0;
        //短路
        if (j == 2 && (k = ++j) == 3) {
            System.out.println("------------11");
        }

        System.out.println("i=" + i + ",j=" + j + ",k=" + k);
        boolean kk = true;
        //非短路
        if ((kk = (j == 6)) & (k = j + 100) == 3) {
            System.out.println("------------22");
        }
        System.out.println("i=" + i + ",j=" + j + ",k=" + k);
        System.out.println(kk);
    }


    public static void main(String[] args) throws InterruptedException {
        //System.out.println(aa);
        //System.out.println(zhong);
        //System.out.println(zhong2);
        //System.out.println(guo);
        //System.out.println(guo2);
        //System.out.println(anInt);
        //System.out.println(guoInt);
        //double x = aDouble + guoInt + guo;
        //System.out.println(x);
        //if (true) {
        //    int num = 100;
        //    System.out.println(num);
        //}
        //System.out.println(num);
        //test1();
        //String sex = "F";
        //System.out.println("M".equals(sex) ? "男" : "女");
        //System.out.println(2 << 2);


        //testWhile();
        //testFor();
        //testDoWhile();
        //testBreakAndContinue();


        //System.out.println("王\n二狗");
        //System.out.println("王\t二狗");
    }

    private static void testBreakAndContinue() {
        int i = 10;
        System.out.println("------------start");
        while (i < 100) {
            if (i == 50) {
                //终止整个代码块
                break;
            }

            if (i == 30) {
                i++;
                //结束本次循环，进入下次循环
                continue;
            }
            System.out.println("i=" + i);
            i++;
        }
        System.out.println("---------------------end");
    }

    /**
     * 不知道多少次，知道循环停止条件，但是至少要执行一次
     *
     * @throws InterruptedException
     */
    private static void testDoWhile() throws InterruptedException {
        //至少会执行一次
        int i = 1;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        do {
            System.out.println("i=" + i);
            Thread.sleep(1000);
            System.out.println(simpleDateFormat.format(new Date()));
            i++;
        } while (false);
    }

    /**
     * 你自己知道循环要执行多少次的时候使用
     */
    private static void testFor() throws InterruptedException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        boolean c = false;
        for (int i = 0; i < 10; i++) {
            System.out.println("i=" + i);
            Thread.sleep(1000);
            System.out.println(simpleDateFormat.format(new Date()));
        }
    }

    /**
     * 不知道多少次，但是知道循环停止条件
     *
     * @throws InterruptedException
     */
    private static void testWhile() throws InterruptedException {
        int i = 1;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        boolean c = false;
        while (c) {
            System.out.println("i=" + i);
            Thread.sleep(1000);
            System.out.println(simpleDateFormat.format(new Date()));
            i++;
        }
    }
}
