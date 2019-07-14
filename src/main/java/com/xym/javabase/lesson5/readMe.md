## Java处理异常的写法

使用try(监控异常)catch(捕获异常)、finally(不管发不发生异常都会执行)关键字

finally执行时机：
1、如果发生了异常，则是在catch块执行完毕之后执行
2、如果没有发生了异常，则是在try块执行完毕之后执行



1、try和catch一起使用
```
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

```

2、`try`和`catch`、`finally`一起使用
```
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

```

3、`try`和`finally`一起使用
```
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

```

### 常见异常
- java.lang.NullPointerException,空指针异常
- java.lang.ArrayIndexOutOfBoundsException，数组越界异常
- java.lang.ArithmeticException，除零异常
- java.lang.NumberFormatException，数字转化异常

## 异常抛出方式
1、throw：异常抛出
1、throws：是用于方法声明上，表示方法可能会抛出声明的异常

### 多重异常捕获规则
- 一段代码可能会引发多种类型的异常，当引发异常时，会按顺序来查看每个 catch 语句，并执行第一个与异常类型匹配的catch语句
执行其中的一条 catch 语句之后，其后的 catch 语句将被忽略 

- 使用多重 catch 语句时，异常子类一定要位于异常父类之前 
```
//NumberFormatException extends IllegalArgumentException
catch (NumberFormatException e) {
    System.out.println("捕获异常1111，" + e.getMessage());
} catch (IllegalArgumentException e) {//ArithmeticException
    System.out.println("捕获异常2222，" + e.getMessage());
}

```




