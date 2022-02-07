# java-learn

[Kotlin](./Kotlin.md)
[Spring](./Spring.md)

- [java-learn](#java-learn)
  - [1. Java基础](#1-java基础)
    - [1.1. Java 基本语法](#11-java-基本语法)
    - [Java 标识符](#java-标识符)
    - [Java修饰符](#java修饰符)
    - [Java 关键字](#java-关键字)
    - [1.2. 基本数据类型](#12-基本数据类型)
      - [1.2.1. 内置数据类型](#121-内置数据类型)
      - [byte](#byte)
      - [short](#short)
      - [int](#int)
      - [long](#long)
      - [float](#float)
      - [double](#double)
      - [boolean](#boolean)
      - [char](#char)
      - [1.2.2. 引用类型](#122-引用类型)
    - [1.3. Java 常量](#13-java-常量)
    - [1.4. 类型转换](#14-类型转换)
      - [1.4.1. 自动类型转换](#141-自动类型转换)
      - [1.4.2. 强制类型转换](#142-强制类型转换)
      - [1.4.3. 隐含强制类型转换](#143-隐含强制类型转换)
    - [1.5. Java 变量类型](#15-java-变量类型)
      - [1.5.1 Java 局部变量](#151-java-局部变量)
      - [1.5.2. 实例变量](#152-实例变量)
      - [1.5.3. 类变量（静态变量）](#153-类变量静态变量)
    - [1.6. Java 修饰符](#16-java-修饰符)
      - [1.6.1. 访问控制修饰符](#161-访问控制修饰符)
      - [1.6.2. 非访问修饰符](#162-非访问修饰符)
    - [1.7. Java 运算符](#17-java-运算符)
      - [1.7.1. 算术运算符](#171-算术运算符)
      - [1.7.2. 关系运算符](#172-关系运算符)
      - [1.7.3. 位运算符](#173-位运算符)
      - [1.7.4. 逻辑运算符](#174-逻辑运算符)
      - [1.7.5. 赋值运算符](#175-赋值运算符)
      - [1.7.6. 条件运算符（?:）](#176-条件运算符)
      - [1.7.7. instanceof 运算符](#177-instanceof-运算符)
      - [1.7.8. Java运算符优先级](#178-java运算符优先级)
    - [1.8. Java 循环结构](#18-java-循环结构)
      - [1.8.1. while 循环](#181-while-循环)
      - [1.8.2. do…while 循环](#182-dowhile-循环)
      - [1.8.3. for循环](#183-for循环)
      - [1.8.4. break 关键字](#184-break-关键字)
      - [1.8.5. continue 关键字](#185-continue-关键字)
    - [1.9. Java 条件语句](#19-java-条件语句)
      - [1.9.1. if 语句](#191-if-语句)
      - [1.9.2. if...else语句](#192-ifelse语句)
      - [1.9.3. if...else if...else 语句](#193-ifelse-ifelse-语句)
      - [1.9.4. 嵌套的 if…else 语句](#194-嵌套的-ifelse-语句)
      - [1.9.5. Java switch case 语句](#195-java-switch-case-语句)
    - [1.10. Java Number & Math 类](#110-java-number--math-类)
    - [1.11. Java Character 类](#111-java-character-类)
    - [1.12. Java String 类](#112-java-string-类)
    - [1.13. Java 数组](#113-java-数组)
      - [多维数组](#多维数组)
    - [1.14. Java 日期时间](#114-java-日期时间)
    - [1.15. Java 正则表达式](#115-java-正则表达式)
    - [1.16. Java 异常处理](#116-java-异常处理)
    - [捕获异常](#捕获异常)
    - [throws/throw 关键字](#throwsthrow-关键字)
    - [finally关键字](#finally关键字)
    - [声明自定义异常](#声明自定义异常)
  - [2. Java 面向对象编程](#2-java-面向对象编程)
    - [2.1. 类，对象和引用](#21-类对象和引用)
  - [3. 线程](#3-线程)


## 1. Java基础

### 1.1. Java 基本语法

一个 Java 程序可以认为是一系列对象的集合，而这些对象通过调用彼此的方法来协同工作。下面简要介绍下类、对象、方法和实例变量的概念。  

对象：对象是类的一个实例，有状态和行为。例如，一条狗是一个对象，它的状态有：颜色、名字、品种；行为有：摇尾巴、叫、吃等。  
类：类是一个模板，它描述一类对象的行为和状态。  
方法：方法就是行为，一个类可以有很多方法。逻辑运算、数据修改以及所有动作都是在方法中完成的。  
实例变量：每个对象都有独特的实例变量，对象的状态由这些实例变量的值决定。  

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World"); // 打印 Hello World
    }
}
```

> 注意以下几点：  

大小写敏感：Java 是大小写敏感的，这就意味着标识符 Hello 与 hello 是不同的。  
类名：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 MyFirstJavaClass 。  
方法名：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。  
源文件名：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存（切记 Java 是大小写敏感的），文件名的后缀为 .java。（如果文件名和类名不相同则会导致编译错误）。  
主方法入口：所有的 Java 程序由 public static void main(String[] args) 方法开始执行。  

### Java 标识符

Java 所有的组成部分都需要名字。类名、变量名以及方法名都被称为标识符。  

关于 Java 标识符，有以下几点需要注意：  

- 所有的标识符都应该以字母（A-Z 或者 a-z）,美元符（$）、或者下划线（_）开始
- 首字符之后可以是字母（A-Z 或者 a-z）,美元符（$）、下划线（_）或数字的任何字符组合
- 关键字不能用作标识符
- 标识符是大小写敏感的
- 合法标识符举例：age、$salary、_value、__1_value
- 非法标识符举例：123abc、-salary

### Java修饰符

使用修饰符来修饰类中方法和属性。主要有两类修饰符：

- 访问控制修饰符 : default, public , protected, private
- 非访问控制修饰符 : final, abstract, static, synchronized

### Java 关键字

这些保留字不能用于常量、变量、和任何标识符的名称。

1. 访问控制

| 关键字 | 说明 |
| --- | --- |
| private | 私有的 |
| protected | 受保护的 |
| public | 公共的 |
| default | 默认 |

2. 类、方法和变量修饰符

| 关键字 | 说明 |
| --- | --- |
| abstract | 声明抽象 |
| class | 类 |
| extends | 扩充,继承 |
| final | 最终值,不可改变的 |
| implements | 实现（接口） |
| interface | 接口 |
| native | 本地，原生方法（非 Java 实现） |
| new | 新,创建 |
| static | 静态 |
| strictfp | 严格,精准 |
| synchronized | 线程,同步 |
| transient | 短暂 |
| volatile | 易失 |

3. 程序控制语句

| 关键字 | 说明 |
| --- | --- |
| break | 跳出循环 |
| case | 定义一个值以供 switch 选择 |
| continue | 继续 |
| default | 默认 |
| do | 运行 |
| else | 否则 |
| for | 循环 |
| if | 如果 |
| instanceof | 实例 |
| return | 返回 |
| switch | 根据值选择执行 |
| while | 循环 |

4. 错误处理

| 关键字 | 说明 |
| --- | --- |
| assert | 断言表达式是否为真 |
| catch | 捕捉异常 |
| finally | 有没有异常都执行 |
| throw | 抛出一个异常对象 |
| throws | 声明一个异常可能被抛出 |
| try | 捕获异常 |

5. 包相关

| 关键字 | 说明 |
| --- | --- |
| import | 引入 |
| package | 包 |

6. 基本类型

| 关键字 | 说明 |
| --- | --- |
| boolean | 布尔型 |
| byte | 字节型 |
| char | 字符型 |
| double | 双精度浮点 |
| float | 单精度浮点 |
| int | 整型 |
| long | 长整型 |
| short | 短整型 |

7. 变量引用

| 关键字 | 说明 |
| --- | --- |
| super | 父类,超类 |
| this | 本类 |
| void | 无返回值 |

8. 保留关键字

| 关键字 | 说明 |
| --- | --- |
| goto | 是关键字，但不能使用 |
| const | 是关键字，但不能使用 |
| null | 空 |

### 1.2. 基本数据类型

变量就是申请内存来存储值。也就是说，当创建变量的时候，需要在内存中申请空间。  

内存管理系统根据变量的类型为变量分配存储空间，分配的空间只能用来储存该类型数据。  

Java 的两大数据类型:  

内置数据类型  
引用数据类型  

#### 1.2.1. 内置数据类型

Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。  

#### byte

- byte 数据类型是8位、有符号的，以二进制补码表示的整数；
- 最小值是 -128（-2^7）；
- 最大值是 127（2^7-1）；
- 默认值是 0；
- byte 类型用在大型数组中节约空间，主要代替整数，因为 byte 变量占用的空间只有 int 类型的四分之一；
- 例子：byte a = 100，byte b = -50。

#### short

- short 数据类型是 16 位、有符号的以二进制补码表示的整数
- 最小值是 -32768（-2^15）；
- 最大值是 32767（2^15 - 1）；
- Short 数据类型也可以像 byte 那样节省空间。一个short变量是int型变量所占空间的二分之一；
- 默认值是 0；
- 例子：short s = 1000，short r = -20000。

#### int

- int 数据类型是32位、有符号的以二进制补码表示的整数；
- 最小值是 -2,147,483,648（-2^31）；
- 最大值是 2,147,483,647（2^31 - 1）；
- 一般地整型变量默认为 int 类型；
- 默认值是 0 ；
- 例子：int a = 100000, int b = -200000。

#### long

- long 数据类型是 64 位、有符号的以二进制补码表示的整数；
- 最小值是 -9,223,372,036,854,775,808（-2^63）；
- 最大值是 9,223,372,036,854,775,807（2^63 -1）；
- 这种类型主要使用在需要比较大整数的系统上；
- 默认值是 0L；
- 例子： long a = 100000L，Long b = -200000L。"L"理论上不分大小写，但是若写成"l"容易与数字"1"混淆，不容易分辩。所以最好大写。

#### float

- float 数据类型是单精度、32位、符合IEEE 754标准的浮点数；
- float 在储存大型浮点数组的时候可节省内存空间；
- 默认值是 0.0f；
- 浮点数不能用来表示精确的值，如货币；
- 例子：float f1 = 234.5f。

#### double

- double 数据类型是双精度、64 位、符合IEEE 754标准的浮点数；
- 浮点数的默认类型为double类型；
- double类型同样不能表示精确的值，如货币；
- 默认值是 0.0d；
- 例子：double d1 = 123.4。

#### boolean

- boolean数据类型表示一位的信息；
- 只有两个取值：true 和 false；
- 这种类型只作为一种标志来记录 true/false 情况；
- 默认值是 false；
- 例子：boolean one = true。

#### char

- char类型是一个单一的 16 位 Unicode 字符；
- 最小值是 \u0000（即为0）；
- 最大值是 \uffff（即为65,535）；
- char 数据类型可以储存任何字符；
- 例子：char letter = 'A';。

```java
import java.math.BigDecimal;

public class PrimaryTypes {
  public static void main(String[] args) {
    byte byteVar = 100;
    System.out.println(byteVar);

    short shortVar = 30000;
    System.out.println(shortVar);

    int intVar = 1000000000;
    System.out.println(intVar);

    long longVar = 80000000000L;
    System.out.println(longVar);

    float floatVar = 100.0000000666F;
    System.out.println(floatVar);

    double doubleVar = 100.0000000666;
    System.out.println(doubleVar);

    boolean booleanVar = true;
    System.out.println(booleanVar);

    char charVar = 'a';
    System.out.println(charVar);
  }
}
```

#### 1.2.2. 引用类型

- 对象、数组都是引用数据类型。
- 所有引用类型的默认值都是null。
- 一个引用变量可以用来引用任何与之兼容的类型。
- 例子：Site site = new Site("Runoob")。

### 1.3. Java 常量

在 Java 中使用 final 关键字来修饰常量，声明方式和变量类似：  

```java
final double PI = 3.1415927;
```

为了便于识别，通常使用大写字母表示常量。  

Java语言支持一些特殊的转义字符序列。

| 符号 | 字符含义 |
| --- | --- |
| \n | 换行 (0x0a) |
| \r | 回车 (0x0d) |
| \f | 换页符(0x0c) |
| \b | 退格 (0x08) |
| \0 | 空字符 (0x0) |
| \s | 空格 (0x20) |
| \t | 制表符 |
| \" | 双引号 |
| \' | 单引号 |
| \\ | 反斜杠 |
| \ddd | 八进制字符 (ddd) |
| \uxxxx | 16进制Unicode字符 (xxxx) |

### 1.4. 类型转换

整型、实型（常量）、字符型数据可以混合运算。运算中，不同类型的数据先转化为同一类型，然后进行运算。  

低  ------------------------------------>  高  

byte,short,char—> int —> long—> float —> double  

数据类型转换必须满足如下规则：  

1. 不能对boolean类型进行类型转换。

2. 不能把对象类型转换成不相关类的对象。

3. 在把容量大的类型转换为容量小的类型时必须使用强制类型转换。

4. 转换过程中可能导致溢出或损失精度，例如：

```java
int i =128;
byte b = (byte)i;
// 因为 byte 类型是 8 位，最大值为127，所以当 int 强制转换为 byte 类型时，值 128 时候就会导致溢出。
```

5. 浮点数到整数的转换是通过舍弃小数得到，而不是四舍五入，例如：

```java
(int)23.7 == 23;
(int)-45.89f == -45
```

#### 1.4.1. 自动类型转换

必须满足转换前的数据类型的位数要低于转换后的数据类型，例如: short数据类型的位数为16位，就可以自动转换位数为32的int类型，同样float数据类型的位数为32，可以自动转换为64位的double类型。

```java
public class ZiDongLeiZhuan{
  public static void main(String[] args){
    char c1='a';//定义一个char类型
    int i1 = c1;//char自动类型转换为int
    System.out.println("char自动类型转换为int后的值等于"+i1);
    char c2 = 'A';//定义一个char类型
    int i2 = c2+1;//char 类型和 int 类型计算
    System.out.println("char类型和int计算后的值等于"+i2);
  }
}
```

#### 1.4.2. 强制类型转换

1. 条件是转换的数据类型必须是兼容的。

2. 格式：(type)value type是要强制类型转换后的数据类型 实例：

```java
public class QiangZhiZhuanHuan{
  public static void main(String[] args){
    int i1 = 123;
    byte b = (byte)i1;//强制类型转换为byte
    System.out.println("int强制类型转换为byte后的值等于"+b);
  }
}
```

#### 1.4.3. 隐含强制类型转换

1. 整数的默认类型是 int。

2. 浮点型不存在这种情况，因为在定义 float 类型时必须在数字后面跟上 F 或者 f。

### 1.5. Java 变量类型

在Java语言中，所有的变量在使用前必须声明。声明变量的基本格式如下：  

type identifier [ = value][, identifier [= value] ...] ;  

Java语言支持的变量类型有：  

- 类变量：独立于方法之外的变量，用 static 修饰。
- 实例变量：独立于方法之外的变量，不过没有 static 修饰。
- 局部变量：类的方法中的变量。

```java
public class Variable{
  static int allClicks=0;    // 类变量
  String str="hello world";  // 实例变量
  public void method(){
      int i =0;  // 局部变量
  }
}
```

#### 1.5.1 Java 局部变量

- 局部变量声明在方法、构造方法或者语句块中；
- 局部变量在方法、构造方法、或者语句块被执行的时候创建，当它们执行完成后，变量将会被销毁；
- 访问修饰符不能用于局部变量；
- 局部变量只在声明它的方法、构造方法或者语句块中可见；
- 局部变量是在栈上分配的。
- 局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。

#### 1.5.2. 实例变量

- 实例变量声明在一个类中，但在方法、构造方法和语句块之外；
- 当一个对象被实例化之后，每个实例变量的值就跟着确定；
- 实例变量在对象创建的时候创建，在对象被销毁的时候销毁；
- 实例变量的值应该至少被一个方法、构造方法或者语句块引用，使得外部能够通过这些方式获取实例变量信息；
- 实例变量可以声明在使用前或者使用后；
- 访问修饰符可以修饰实例变量；
- 实例变量对于类中的方法、构造方法或者语句块是可见的。一般情况下应该把实例变量设为私有。通过使用访问修饰符可以使实例变量对子类可见；
- 实例变量具有默认值。数值型变量的默认值是0，布尔型变量的默认值是false，引用类型变量的默认值是null。变量的值可以在声明时指定，也可以在构造方法中指定；
- 实例变量可以直接通过变量名访问。但在静态方法以及其他类中，就应该使用完全限定名：ObejectReference.VariableName。

#### 1.5.3. 类变量（静态变量）

- 类变量也称为静态变量，在类中以 static 关键字声明，但必须在方法之外。
- 无论一个类创建了多少个对象，类只拥有类变量的一份拷贝。
- 静态变量除了被声明为常量外很少使用，静态变量是指声明为 public/private，final 和 static 类型的变量。静态变量初始化后不可改变。
- 静态变量储存在静态存储区。经常被声明为常量，很少单独使用static声明变量。
- 静态变量在第一次被访问时创建，在程序结束时销毁。
- 与实例变量具有相似的可见性。但为了对类的使用者可见，大多数静态变量声明为public类型。
- 默认值和实例变量相似。数值型变量默认值是0，布尔型默认值是false，引用类型默认值是null。变量的值可以在声明的时候指定，也可以在构造方法中指定。此外，静态变量还可以在静态语句块中初始化。
- 静态变量可以通过：ClassName.VariableName的方式访问。
- 类变量被声明为public static final类型时，类变量名称一般建议使用大写字母。如果静态变量不是public和final类型，其命名方式与实例变量以及局部变量的命名方式一致。

### 1.6. Java 修饰符

Java语言提供了很多修饰符，主要分为以下两类：  

访问修饰符  
非访问修饰符  

#### 1.6.1. 访问控制修饰符

Java中，可以使用访问控制符来保护对类、变量、方法和构造方法的访问。Java 支持 4 种不同的访问权限。

- default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
- private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
- public : 对所有类可见。使用对象：类、接口、变量、方法
- protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。

#### 1.6.2. 非访问修饰符

- static 修饰符，用来修饰类方法和类变量。
- final 修饰符，用来修饰类、方法和变量，final 修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。
- abstract 修饰符，用来创建抽象类和抽象方法。
- synchronized 和 volatile 修饰符，主要用于线程的编程。

### 1.7. Java 运算符

#### 1.7.1. 算术运算符

| 操作符 | 描述 | 例子 |
| --- | --- | --- |
| + | 加法 - 相加运算符两侧的值 | A + B 等于 30 |
| - | 减法 - 左操作数减去右操作数 | A – B 等于 -10 |
| * | 乘法 - 相乘操作符两侧的值 | A * B等于200 |
| / | 除法 - 左操作数除以右操作数 | B / A等于2 |
| ％ | 取余 - 左操作数除以右操作数的余数 | B%A等于0 |
| ++ | 自增: 操作数的值增加1 | B++ 或 ++B 等于 21 |
| -- | 自减: 操作数的值减少1 | B-- 或 --B 等于 19 |

#### 1.7.2. 关系运算符

| 运算符 | 描述 | 例子 |
| --- | --- | --- |
| == | 检查如果两个操作数的值是否相等，如果相等则条件为真。 | （A == B）为假。 |
| != | 检查如果两个操作数的值是否相等，如果值不相等则条件为真。 | (A != B) 为真。 |
| >  | 检查左操作数的值是否大于右操作数的值，如果是那么条件为真。 | （A> B）为假。 |
| <  | 检查左操作数的值是否小于右操作数的值，如果是那么条件为真。 | （A <B）为真。 |
| >= | 检查左操作数的值是否大于或等于右操作数的值，如果是那么条件为真。 | （A> = B）为假。 |
| <= | 检查左操作数的值是否小于或等于右操作数的值，如果是那么条件为真。 | （A <= B）为真。 |

#### 1.7.3. 位运算符

Java定义了位运算符，应用于整数类型(int)，长整型(long)，短整型(short)，字符型(char)，和字节型(byte)等类型。  

位运算符作用在所有的位上，并且按位运算。假设a = 60，b = 13; 它们的二进制格式表示将如下：  

```text
A = 0011 1100
B = 0000 1101
-----------------
A&B = 0000 1100
A | B = 0011 1101
A ^ B = 0011 0001
~A= 1100 0011
```

| 操作符 | 描述 | 例子 |
| --- | --- | --- |
| ＆ | 如果相对应位都是1，则结果为1，否则为0 | （A＆B），得到12，即0000 1100 |
| | | 如果相对应位都是 0，则结果为 0，否则为 1 | （A | B）得到61，即 0011 1101 |
| ^ | 如果相对应位值相同，则结果为0，否则为1 | （A ^ B）得到49，即 0011 0001 |
| 〜 | 按位取反运算符翻转操作数的每一位，即0变成1，1变成0。 | （〜A）得到-61，即1100 0011 |
| <<  | 按位左移运算符。左操作数按位左移右操作数指定的位数。 | A << 2得到240，即 1111 0000 |
| >>  | 按位右移运算符。左操作数按位右移右操作数指定的位数。 | A >> 2得到15即 1111 |
| >>>  | 按位右移补零操作符。左操作数的值按右操作数指定的位数右移，移动得到的空位以零填充。 | A>>>2得到15即0000 1111 |

#### 1.7.4. 逻辑运算符

| -操作符 | 描述 | 例子 |
| --- | --- | --- |
| -&& | 称为逻辑与运算符。当且仅当两个操作数都为真，条件才为真。 | （A && B）为假。 |
| -| | 称为逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。 | （A | | B）为真。 |
| -！ | 称为逻辑非运算符。用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false。 | ！（A && B）为真。 |

#### 1.7.5. 赋值运算符

| 操作符 | 描述 | 例子 |
| --- | --- | --- |
| = | 简单的赋值运算符，将右操作数的值赋给左侧操作数 | C = A + B将把A + B得到的值赋给C |
| + = | 加和赋值操作符，它把左操作数和右操作数相加赋值给左操作数 | C + = A等价于C = C + A |
| - = | 减和赋值操作符，它把左操作数和右操作数相减赋值给左操作数 | C - = A等价于C = C - A |
| * = | 乘和赋值操作符，它把左操作数和右操作数相乘赋值给左操作数 | C * = A等价于C = C * A |
| / = | 除和赋值操作符，它把左操作数和右操作数相除赋值给左操作数 | C / = A，C 与 A 同类型时等价于 C = C / A |
| （％）= | 取模和赋值操作符，它把左操作数和右操作数取模后赋值给左操作数 | C％= A等价于C = C％A |
| << = | 左移位赋值运算符 | C << = 2等价于C = C << 2 |
| >> = | 右移位赋值运算符 | C >> = 2等价于C = C >> 2 |
| ＆= | 按位与赋值运算符 | C＆= 2等价于C = C＆2 |
| ^ = | 按位异或赋值操作符 | C ^ = 2等价于C = C ^ 2 |
| | = | 按位或赋值操作符 | C | = 2等价于C = C | 2 |

#### 1.7.6. 条件运算符（?:）

条件运算符也被称为三元运算符。该运算符有3个操作数，并且需要判断布尔表达式的值。该运算符的主要是决定哪个值应该赋值给变量。  

variable x = (expression) ? value if true : value if false  

#### 1.7.7. instanceof 运算符

该运算符用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）。

```java
String name = "James";
boolean result = name instanceof String; // 由于 name 是 String 类型，所以返回真
```

#### 1.7.8. Java运算符优先级

下表中具有最高优先级的运算符在的表的最上面，最低优先级的在表的底部。

| 类别 | 操作符 | 关联性 |
| --- | --- | --- |
| 后缀 | () [] . (点操作符) | 左到右 |
| 一元 | expr++ expr-- | 从左到右 |
| 一元 | ++expr --expr + - ～ ！ | 从右到左 |
| 乘性  | * /％ | 左到右 |
| 加性 | + - | 左到右 |
| 移位 | >> >>>  <<  | 左到右 |
| 关系  | > >= < <=  | 左到右 |
| 相等  | ==  != | 左到右 |
| 按位与 | ＆ | 左到右 |
| 按位异或 | ^ | 左到右 |
| 按位或 | | | 左到右 |
| 逻辑与 | && | 左到右 |
| 逻辑或 | | | | 左到右 |
| 条件 | ？： | 从右到左 |
| 赋值| = + = - = * = / =％= >> = << =＆= ^ = | =| 从右到左 |
| 逗号| ，| 左到右 |

### 1.8. Java 循环结构

#### 1.8.1. while 循环

```java
while( 布尔表达式 ) {
  //循环内容
}
```

```java
public class Test {
  public static void main(String args[]) {
    int x = 10;
    while( x < 20 ) {
      System.out.print("value of x : " + x );
      x++;
      System.out.print("\n");
    }
  }
}
```

#### 1.8.2. do…while 循环

do…while 循环和 while 循环相似，不同的是，do…while 循环至少会执行一次。

```java
do {
       //代码语句
}while(布尔表达式);
```

```java
public class Test {
   public static void main(String args[]){
      int x = 10;
      do{
         System.out.print("value of x : " + x );
         x++;
         System.out.print("\n");
      }while( x < 20 );
   }
}
```

#### 1.8.3. for循环

for循环执行的次数是在执行前就确定的。语法格式如下：

```java
for(初始化; 布尔表达式; 更新) {
    //代码语句
}
```

```java
public class Test {
   public static void main(String args[]) {
      for(int x = 10; x < 20; x = x+1) {
         System.out.print("value of x : " + x );
         System.out.print("\n");
      }
   }
}
```

#### 1.8.4. break 关键字

break 主要用在循环语句或者 switch 语句中，用来跳出整个语句块。  

break 跳出最里层的循环，并且继续执行该循环下面的语句。  

```java
public class Test {
   public static void main(String args[]) {
      int [] numbers = {10, 20, 30, 40, 50};
 
      for(int x : numbers ) {
         // x 等于 30 时跳出循环
         if( x == 30 ) {
            break;
         }
         System.out.print( x );
         System.out.print("\n");
      }
   }
}
```

#### 1.8.5. continue 关键字

continue 适用于任何循环控制结构中。作用是让程序立刻跳转到下一次循环的迭代。  

在 for 循环中，continue 语句使程序立即跳转到更新语句。  

在 while 或者 do…while 循环中，程序立即跳转到布尔表达式的判断语句。  

```java
public class Test {
   public static void main(String args[]) {
      int [] numbers = {10, 20, 30, 40, 50};
      for(int x : numbers ) {
         if( x == 30 ) {
        continue;
         }
         System.out.print( x );
         System.out.print("\n");
      }
   }
}
```

### 1.9. Java 条件语句

#### 1.9.1. if 语句

```java
if(布尔表达式)
{
   //如果布尔表达式为true将执行的语句
}
```

#### 1.9.2. if...else语句

```java
if(布尔表达式){
   //如果布尔表达式的值为true
}else{
   //如果布尔表达式的值为false
}
```

#### 1.9.3. if...else if...else 语句

```java
if(布尔表达式 1){
   //如果布尔表达式 1的值为true执行代码
}else if(布尔表达式 2){
   //如果布尔表达式 2的值为true执行代码
}else if(布尔表达式 3){
   //如果布尔表达式 3的值为true执行代码
}else {
   //如果以上布尔表达式都不为true执行代码
}
```

#### 1.9.4. 嵌套的 if…else 语句

```java
if(布尔表达式 1){
   ////如果布尔表达式 1的值为true执行代码
   if(布尔表达式 2){
      ////如果布尔表达式 2的值为true执行代码
   }
}
```

#### 1.9.5. Java switch case 语句

switch case 语句判断一个变量与一系列值中某个值是否相等，每个值称为一个分支。  

```java
switch(expression){
   case value :
      //语句
      break; //可选
   case value :
      //语句
      break; //可选
   //你可以有任意数量的case语句
   default : //可选
      //语句
}
```

switch case 执行时，一定会先进行匹配，匹配成功返回当前 case 的值，再根据是否有 break，判断是否继续输出，或是跳出判断。

### 1.10. Java Number & Math 类

所有的包装类（Integer、Long、Byte、Double、Float、Short）都是抽象类 Number 的子类。

| 装类 | 基本数据类型 |
| --- | --- |
| Boolean | boolean |
| Byte | byte |
| Short | short |
| Integer | int |
| Long | long |
| Character | char |
| Float | float |
| Double | double |

这种由编译器特别支持的包装称为装箱，所以当内置数据类型被当作对象使用的时候，编译器会把内置类型装箱为包装类。相似的，编译器也可以把一个对象拆箱为内置类型。Number 类属于 java.lang 包。  

Java 的 Math 包含了用于执行基本数学运算的属性和方法，如初等指数、对数、平方根和三角函数。  

Math 的方法都被定义为 static 形式，通过 Math 类可以在主函数中直接调用。

```java
public class Test {  
    public static void main (String []args)  
    {  
        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));  
        System.out.println("0度的余弦值：" + Math.cos(0));  
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));  
        System.out.println("1的反正切值： " + Math.atan(1));  
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));  
        System.out.println(Math.PI);  
    }  
}
```

### 1.11. Java Character 类

Character 类用于对单个字符进行操作。

```java
char ch = 'a';
 
// Unicode 字符表示形式
char uniChar = '\u039A'; 
 
// 字符数组
char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };
```

### 1.12. Java String 类

在 Java 中字符串属于对象，Java 提供了 String 类来创建和操作字符串。

```java
public class StringDemo{
   public static void main(String args[]){
      char[] helloArray = { 'r', 'u', 'n', 'o', 'o', 'b'};
      String helloString = new String(helloArray);  
      System.out.println( helloString );
   }
}
```

StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。  
StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。  
由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。

```java
public class Test{
  public static void main(String args[]){
    StringBuffer sBuffer = new StringBuffer("java：");
    sBuffer.append("www");
    sBuffer.append(".java");
    sBuffer.append(".com");
    System.out.println(sBuffer);  
  }
}
```

### 1.13. Java 数组

声明数组变量

```text
dataType[] arrayRefVar;   // 首选的方法
或
dataType arrayRefVar[];  // 效果相同，但不是首选方法
```

```java
public class CreateArray {
    public static void main(String[] args) {
        int[] intArray = new int[9];

        System.out.println(intArray[2]);

        double[] doubleArray = new double[100];

        System.out.println(doubleArray[66]);

    }
}
```

#### 多维数组

多维数组可以看成是数组的数组，比如二维数组就是一个特殊的一维数组，其每一个元素都是一个一维数组，例如：  

String str[][] = new String[3][4];  

### 1.14. Java 日期时间

java.util 包提供了 Date 类来封装当前的日期和时间。 Date 类提供两个构造函数来实例化 Date 对象。  

第一个构造函数使用当前日期和时间来初始化对象。  

Date( )  

第二个构造函数接收一个参数，该参数是从1970年1月1日起的毫秒数。  

Date(long millisec)  

```java
import java.util.Date;
  
public class DateDemo {
   public static void main(String args[]) {
       // 初始化 Date 对象
       Date date = new Date();
        
       // 使用 toString() 函数显示日期时间
       System.out.println(date.toString());
   }
}
```

使用 SimpleDateFormat 格式化日期

```java
import  java.util.*;
import java.text.*;
 
public class DateDemo {
   public static void main(String args[]) {
 
      Date dNow = new Date( );
      SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
 
      System.out.println("当前时间为: " + ft.format(dNow));
   }
}
```

使用printf格式化日期  
printf 方法可以很轻松地格式化时间和日期。使用两个字母格式，它以 %t 开头并且以下面表格中的一个字母结尾。  

|转换符 | 说明 | 示例 |
| --- | --- | --- |
| c | 包括全部日期和时间信息 | 星期六 十月 27 14:21:20 CST 2007 |
| F | "年-月-日"格式 | 2007-10-27 |
| D | "月/日/年"格式 | 10/27/07 |
| r | "HH:MM:SS PM"格式（12时制） | 02:25:51 下午 |
| T | "HH:MM:SS"格式（24时制） | 14:28:16 |
| R | "HH:MM"格式（24时制）| 14:28 |

### 1.15. Java 正则表达式

java.util.regex 包主要包括以下三个类：  

Pattern 类：  
pattern 对象是一个正则表达式的编译表示。Pattern 类没有公共构造方法。要创建一个 Pattern 对象，你必须首先调用其公共静态编译方法，它返回一个 Pattern 对象。该方法接受一个正则表达式作为它的第一个参数。  

Matcher 类：  
Matcher 对象是对输入字符串进行解释和匹配操作的引擎。与Pattern 类一样，Matcher 也没有公共构造方法。你需要调用 Pattern 对象的 matcher 方法来获得一个 Matcher 对象。  

PatternSyntaxException：  
PatternSyntaxException 是一个非强制异常类，它表示一个正则表达式模式中的语法错误。  

### 1.16. Java 异常处理

三种类型的异常：  

检查性异常：最具代表的检查性异常是用户错误或问题引起的异常，这是程序员无法预见的。例如要打开一个不存在文件时，一个异常就发生了，这些异常在编译时不能被简单地忽略。  
运行时异常： 运行时异常是可能被程序员避免的异常。与检查性异常相反，运行时异常可以在编译时被忽略。  
错误： 错误不是异常，而是脱离程序员控制的问题。错误在代码中通常被忽略。例如，当栈溢出时，一个错误就发生了，它们在编译也检查不到的。  

### 捕获异常

使用 try 和 catch 关键字可以捕获异常。try/catch 代码块放在异常可能发生的地方。

```java
try
{
   // 程序代码
}catch(ExceptionName e1)
{
   //Catch 块
}
```

```java
import java.io.*;
public class ExcepTest{
   public static void main(String args[]){
      try{
         int a[] = new int[2];
         System.out.println("Access element three :" + a[3]);
      }catch(ArrayIndexOutOfBoundsException e){
         System.out.println("Exception thrown  :" + e);
      }
      System.out.println("Out of the block");
   }
}
```

### throws/throw 关键字

如果一个方法没有捕获到一个检查性异常，那么该方法必须使用 throws 关键字来声明。throws 关键字放在方法签名的尾部。  

也可以使用 throw 关键字抛出一个异常，无论它是新实例化的还是刚捕获到的。  

```java
import java.io.*;
public class className
{
  public void deposit(double amount) throws RemoteException
  {
    throw new RemoteException();
  }
}
```

### finally关键字

finally 关键字用来创建在 try 代码块后面执行的代码块。  

无论是否发生异常，finally 代码块中的代码总会被执行。  

在 finally 代码块中，可以运行清理类型等收尾善后性质的语句。  

```java
public class ExcepTest{
  public static void main(String args[]){
    int a[] = new int[2];
    try{
       System.out.println("Access element three :" + a[3]);
    }catch(ArrayIndexOutOfBoundsException e){
       System.out.println("Exception thrown  :" + e);
    }
    finally{
       a[0] = 6;
       System.out.println("First element value: " +a[0]);
       System.out.println("The finally statement is executed");
    }
  }
}
```

### 声明自定义异常

在 Java 中你可以自定义异常。编写自己的异常类时需要记住下面的几点。

- 所有异常都必须是 Throwable 的子类。
- 如果希望写一个检查性异常类，则需要继承 Exception 类。
- 如果你想写一个运行时异常类，那么需要继承 RuntimeException 类。

```java
class MyException extends Exception{
}
```

## 2. Java 面向对象编程

### 2.1. 类，对象和引用

1. 如何创建类的实例/对象

类(class)真正的用途

- 是用来描述同一类事物的
- 可以在内部定义任意数量的、不同类型的变量，作为这一类事物的属性。这种属性叫做成员变量 (member variable)。
- 有类名，类名必须和文件名一样
- 就好像文件路径+文件名不能重复一样，一个Java程序中相同名字的类只能有一个

2. 通过点操作符操作对象的属性

> 引用类型

Java 中的数据类型分为基本数据类型和引用数据类型

1. 相同点

- 都可以用来创建变量，可以赋值和使用其值
- 本身都是一个地址

2. 不同点

- 基本类型变量的值，就是地址对应的值。引用数据类型的值还是一个地址，需要通过 “二级跳”找到实例.
- 引用数据类型是Java的一种内部类型，是对所有自定义类型和数组引用的统称，并非 特指某种类型.


## 3. 线程














