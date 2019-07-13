## java环境配置

1. 配置`JAVA_HOME`
2. 配置`PATH`
3. 配置`classpath`

## java程序步骤

1. 开发java源程序(编写.java文件)
2. 编译程序（javac命令编译，.java-->class文件）
3. 运行class文件（java命令运行class文件）

## java注释
1. `//`单行注释
2. `/**/`单行、多行注释
3. `/**    */`文档注释

## 类定义（用class关键字）

类体用`{`开始 ,`}`结束

## main方法解释
```
public static void main(String[] args) {

public：     访问修饰符
static：     标识该方法是类（通过名字直接访问）方法，无需通过实例（对象）访问
  void：     返回类型，标识无返回值
  main：     方法名称（main为程序执行入口，方法名称固定不能改变）
String[]:args 方法参数，类型为字符串数组
```
