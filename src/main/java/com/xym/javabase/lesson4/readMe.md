## 继承
通过`extends`关键字指定
`public class Son extends Father`

### 继承的特点

- 先调用父类构造方法，再调用子类构造方法
- 如果调用父类有参构造方法则需要显示指定（`super(arg...)`）,否则编译不通过
- 子类对象可以指向父类引用`

```
   //子类
   Son son = new Son();
   //子类对象指向父类
   Father father = son;

public Son(String name, int age, long jiachan, String work) {
    //调用父类有参构造方法
    super(name, age, jiachan);
    this.work = work;
}
    
```

## 面向对象多态性
- 方法的重载（不同参数的构造函数/普通方法）
```
//print(123);
 //print("12345");
 //print(3.14F);
 //print("第一个字符串", "第二个字符串");
         
```
- 方法的重写（父子类之间的方法的重定义）
```
    /**
     * 方法的重写
     */
    @Override
    protected void showJiaChan() {
        System.out.println("son--" + jiachan);
    }

```
- 接口多个实现（一个接口有多个实现类）
```
public class Tiger implements Runable {
public class Student implements Runable {
public class Car implements Runable {

```



### 重载和重写比较

|          | 重载                                         | 重写                                                       |
| -------- | -------------------------------------------- | ---------------------------------------------------------- |
| 参数列表 | 必须不同（要么类型不同，要么是参数个数不同） | 必定一样                                                   |
| 返回类型 | 可以相同，也可以不同                         | 基本类型必须一致，引用类型要  么相同，要么有继承关系       |
| 访问权限 | 没有要求                                     | 子类重写的方法不能有比父类重写更窄的访问权限               |
| 抛出异常 | 没有要求                                     | 不能抛出新的异常，子类不能抛出比父类更大的异常             |
| 调用     | 参数类型决定调用方法                         | 对象的类型决定调用哪个方法（如果是父类引用调用就调用子类） |

### 类的访问修饰符

| 位置                             | private | 默认 | protected | public |
| -------------------------------- | :-----: | ---- | :-------: | :----: |
| 同一个类                         |    √    | √    |     √     |   √    |
| 同一个包内的类                   |    ×    | √    |     √     |   √    |
| 不同包的子类                     |    ×    | ×    |     √     |   √    |
| 不同包内的子类不同包并且不是子类 |    ×    | ×    |     ×     |   √    |



### 接口与抽象类的区别

| 对比项   | 接口                                                         | 抽象类                                     |
| -------- | ------------------------------------------------------------ | ------------------------------------------ |
| 声明     | interface                                                    | abstract class                             |
| 成员变量 | public static  final（静态常量）                             | 与普通类一样定义                           |
| 方法     | 所有方法只能是声明没有实现（jdk1.7之前，1.8之后可以有default/static方法了） | 可以有实现方法，但必须至少要有一个抽象方法 |
| 继承     | 一个类可以实现多个接口，一个接口可以被另一个接口继承         | 一个抽象类只能被类继承                     |
| 多态     | 接口类型的引用可以指向任何实现该接口的类或该实现自该接口子类的类 | 抽象类的引用可以指向子类的对象象           |

