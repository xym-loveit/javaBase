## 封装
- 信息隐藏,隐藏对象的实现细节，不让用户看到
- 将东西包装在一起，然后以新的完整形式呈现出来
```
    /**
     * 三个属性全是private(封装)
     */
    private String name;
    private int age;
    private int sex;


    /**
     * 用方法封装对属性的访问可以更灵活控制我们的属性值
     *
     * @param age
     */
    public void setAge(int age) {
        if (age > 1 && age <= 120) {
            this.age = age;
        }
        throw new IllegalArgumentException("年龄设置错误，范围在1到120之间");
    }
```

### 类的命名规则：
- 不能为 Java中的关键字(`class/for/float/int`)
- 不能包含空格或点号“. ”(`he llo`/`wor.ld`)
- 可以下划线“_”、字母或“$”符号开头



## 局部变量
局部变量是定义在语句块中的.诸如:方法体,循环体,if或else语句后的一对大括号都是语句块

- 类体不是语句块.
- 局部变量的作用域:只在一个语句块内有效，其生命周期是从开始执行声明它的语句开始到其所在的语句块结束而结束.
- 在同一个局部同名的局部变量只能有一个

## this关键字
- 用于任何实例方法内，指向当前对象
- this的值指向对其调用当前方法的对象  
- this关键字可在需要当前类类型的对象引用时使用 

## 构造方法
每当创建给定类的实例时就调用的方法
- 与类同名，但没有返回类型
- Java为对象分配内存,初始化实例变量并调用构造方法
- 两种构造方法
    - 参数化构造方法
    - 隐式构造方法

## 包的作用
- 包允许将类组合成较小的单元（类似文件夹），使其易于找到和使用相应的类文件
有助于避免命名冲突。在使用许多类时，类和方法的名称很难决定。有时需要使用与其他类相同的名称。包基本上隐藏了类并避免了名称上的冲突
- 包允许在更广的范围内保护类、数据和方法，可以在包内定义类，而在包外的代码不能访问该类 