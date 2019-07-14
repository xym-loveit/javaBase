package com.xym.javabase.lesson5;

/**
 * 描述类作用
 *
 * @author xym
 * @create 2019-07-14 14:12
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        //division(4, 2);
        //division2(4, 0);
        //division2(4, 2);
        //division3(4, 2);
        //division4(4, 0);
        //division5(4, 0);
        //division6(4, 2);
        //System.out.println("继续执行---main");
        // java.lang.NullPointerException
        //String str = null;
        //System.out.println(str.length());
        //java.lang.ArrayIndexOutOfBoundsException: 2
        //int[] a = new int[]{1, 2, 3, 4};//0,1
        //System.out.println(a[4]);
        //System.out.println(1/0);
        //System.out.println(Integer.parseInt("111w"));

        Student student = new Student();
        try {
            student.setAge(20);
            System.out.println(student);
        } catch (StudentException e) {
            e.printStackTrace();
        }
    }

    /**
     * 除数除零异常java.lang.ArithmeticException: / by zero
     *
     * @param a
     * @param b
     */
    public static void division1(int a, int b) {
        int x = a / b;
        //
        System.out.println("x=" + x);
        System.out.println("正常执行----11111");
    }

    /**
     * 除数除零异常java.lang.ArithmeticException: / by zero
     *
     * @param a
     * @param b
     */
    public static void division2(int a, int b) {
        try {
            int x = a / b;
            //
            System.out.println("x=" + x);
            System.out.println("正常执行division2----11111");
        } catch (Exception e) {
            //只有发生了异常，异常被捕获了，才会调用catch代码块
            System.out.println("异常发生了，" + e.getMessage());
        }
        System.out.println("正常执行----2222");
    }


    /**
     * 除数除零异常java.lang.ArithmeticException: / by zero
     *
     * @param a
     * @param b
     */
    public static void division3(int a, int b) {
        try {
            int x = a / b;
            //
            System.out.println("x=" + x);
            System.out.println("正常执行division3----11111");
        } catch (Exception e) {
            //只有发生了异常，异常被捕获了，才会调用catch代码块
            System.out.println("异常发生了，" + e.getMessage());
        } finally {
            //正常情况和异常情况都会执行
            System.out.println("finally代码块-------------");
        }
        System.out.println("正常执行----2222");
    }

    /**
     * 除数除零异常java.lang.ArithmeticException: / by zero
     *
     * @param a
     * @param b
     */
    public static void division4(int a, int b) {
        try {
            int x = a / b;
            //
            System.out.println("x=" + x);
            System.out.println("正常执行division4----11111");
        } finally {
            //正常情况和异常情况都会执行
            System.out.println("finally代码块division4-------------");
        }
        System.out.println("正常执行----2222");
    }

    public static void division5(int a, int b) {
        try {
            int x = a / b;
            //
            System.out.println("x=" + x);
            System.out.println("正常执行division4----11111");
            //ArithmeticException-->RuntimeException-->Exception-->Throwable
            //IllegalArgumentException-->RuntimeException-->Exception-->Throwable
        } catch (IllegalArgumentException e) {//ArithmeticException
            System.out.println("捕获异常，" + e.getMessage());
        }
        System.out.println("正常执行----2222");
    }

    public static void division6(int a, int b) {
        try {
            int x = a / b;
            //
            System.out.println("x=" + x);
            System.out.println("正常执行division6----11111");
            System.out.println(Integer.parseInt("123W"));
            //ArithmeticException-->RuntimeException-->Exception-->Throwable
            //IllegalArgumentException-->RuntimeException-->Exception-->Throwable
            //NumberFormatException extends IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("捕获异常1111，" + e.getMessage());
        } catch (ArithmeticException e) {//ArithmeticException
            System.out.println("捕获异常2222，" + e.getMessage());
        } catch (Exception e) {
            System.out.println("捕获异常3333，" + e.getMessage());
        }
        System.out.println("正常执行division6----2222");
    }

}
