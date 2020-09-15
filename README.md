# java-learn

## 1. Java

### 1. Java 基本语法

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

### 1.1. 基本数据类型

变量就是申请内存来存储值。也就是说，当创建变量的时候，需要在内存中申请空间。  

内存管理系统根据变量的类型为变量分配存储空间，分配的空间只能用来储存该类型数据。  

Java 的两大数据类型:  

内置数据类型  
引用数据类型  

#### 1.1. 内置数据类型

Java语言提供了八种基本类型。六种数字类型（四个整数型，两个浮点型），一种字符类型，还有一种布尔型。  

##### byte

- byte 数据类型是8位、有符号的，以二进制补码表示的整数；
- 最小值是 -128（-2^7）；
- 最大值是 127（2^7-1）；
- 默认值是 0；
- byte 类型用在大型数组中节约空间，主要代替整数，因为 byte 变量占用的空间只有 int 类型的四分之一；
- 例子：byte a = 100，byte b = -50。

##### short

- short 数据类型是 16 位、有符号的以二进制补码表示的整数
- 最小值是 -32768（-2^15）；
- 最大值是 32767（2^15 - 1）；
- Short 数据类型也可以像 byte 那样节省空间。一个short变量是int型变量所占空间的二分之一；
- 默认值是 0；
- 例子：short s = 1000，short r = -20000。

##### int

- int 数据类型是32位、有符号的以二进制补码表示的整数；
- 最小值是 -2,147,483,648（-2^31）；
- 最大值是 2,147,483,647（2^31 - 1）；
- 一般地整型变量默认为 int 类型；
- 默认值是 0 ；
- 例子：int a = 100000, int b = -200000。

##### long

- long 数据类型是 64 位、有符号的以二进制补码表示的整数；
- 最小值是 -9,223,372,036,854,775,808（-2^63）；
- 最大值是 9,223,372,036,854,775,807（2^63 -1）；
- 这种类型主要使用在需要比较大整数的系统上；
- 默认值是 0L；
- 例子： long a = 100000L，Long b = -200000L。"L"理论上不分大小写，但是若写成"l"容易与数字"1"混淆，不容易分辩。所以最好大写。

##### float

- float 数据类型是单精度、32位、符合IEEE 754标准的浮点数；
- float 在储存大型浮点数组的时候可节省内存空间；
- 默认值是 0.0f；
- 浮点数不能用来表示精确的值，如货币；
- 例子：float f1 = 234.5f。

##### double

- double 数据类型是双精度、64 位、符合IEEE 754标准的浮点数；
- 浮点数的默认类型为double类型；
- double类型同样不能表示精确的值，如货币；
- 默认值是 0.0d；
- 例子：double d1 = 123.4。

##### boolean

- boolean数据类型表示一位的信息；
- 只有两个取值：true 和 false；
- 这种类型只作为一种标志来记录 true/false 情况；
- 默认值是 false；
- 例子：boolean one = true。

##### char

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

#### 1.2. 引用类型

- 对象、数组都是引用数据类型。
- 所有引用类型的默认值都是null。
- 一个引用变量可以用来引用任何与之兼容的类型。
- 例子：Site site = new Site("Runoob")。

#### 1.3. Java 常量

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

#### 1.4. 自动类型转换

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

#### 1.5. 自动类型转换

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

#### 1.6. 强制类型转换

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

#### 1.7. 隐含强制类型转换

1. 整数的默认类型是 int。

2. 浮点型不存在这种情况，因为在定义 float 类型时必须在数字后面跟上 F 或者 f。

### 1.2. Java 变量类型

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

#### Java 局部变量

- 局部变量声明在方法、构造方法或者语句块中；
- 局部变量在方法、构造方法、或者语句块被执行的时候创建，当它们执行完成后，变量将会被销毁；
- 访问修饰符不能用于局部变量；
- 局部变量只在声明它的方法、构造方法或者语句块中可见；
- 局部变量是在栈上分配的。
- 局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用。

#### 实例变量

- 实例变量声明在一个类中，但在方法、构造方法和语句块之外；
- 当一个对象被实例化之后，每个实例变量的值就跟着确定；
- 实例变量在对象创建的时候创建，在对象被销毁的时候销毁；
- 实例变量的值应该至少被一个方法、构造方法或者语句块引用，使得外部能够通过这些方式获取实例变量信息；
- 实例变量可以声明在使用前或者使用后；
- 访问修饰符可以修饰实例变量；
- 实例变量对于类中的方法、构造方法或者语句块是可见的。一般情况下应该把实例变量设为私有。通过使用访问修饰符可以使实例变量对子类可见；
- 实例变量具有默认值。数值型变量的默认值是0，布尔型变量的默认值是false，引用类型变量的默认值是null。变量的值可以在声明时指定，也可以在构造方法中指定；
- 实例变量可以直接通过变量名访问。但在静态方法以及其他类中，就应该使用完全限定名：ObejectReference.VariableName。

#### 类变量（静态变量）

- 类变量也称为静态变量，在类中以 static 关键字声明，但必须在方法之外。
- 无论一个类创建了多少个对象，类只拥有类变量的一份拷贝。
- 静态变量除了被声明为常量外很少使用，静态变量是指声明为 public/private，final 和 static 类型的变量。静态变量初始化后不可改变。
- 静态变量储存在静态存储区。经常被声明为常量，很少单独使用static声明变量。
- 静态变量在第一次被访问时创建，在程序结束时销毁。
- 与实例变量具有相似的可见性。但为了对类的使用者可见，大多数静态变量声明为public类型。
- 默认值和实例变量相似。数值型变量默认值是0，布尔型默认值是false，引用类型默认值是null。变量的值可以在声明的时候指定，也可以在构造方法中指定。此外，静态变量还可以在静态语句块中初始化。
- 静态变量可以通过：ClassName.VariableName的方式访问。
- 类变量被声明为public static final类型时，类变量名称一般建议使用大写字母。如果静态变量不是public和final类型，其命名方式与实例变量以及局部变量的命名方式一致。

### 1.3. Java 修饰符

Java语言提供了很多修饰符，主要分为以下两类：  

访问修饰符  
非访问修饰符  

#### 访问控制修饰符

Java中，可以使用访问控制符来保护对类、变量、方法和构造方法的访问。Java 支持 4 种不同的访问权限。

- default (即默认，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
- private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
- public : 对所有类可见。使用对象：类、接口、变量、方法
- protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。

#### 非访问修饰符

- static 修饰符，用来修饰类方法和类变量。
- final 修饰符，用来修饰类、方法和变量，final 修饰的类不能够被继承，修饰的方法不能被继承类重新定义，修饰的变量为常量，是不可修改的。
- abstract 修饰符，用来创建抽象类和抽象方法。
- synchronized 和 volatile 修饰符，主要用于线程的编程。

### 1.4. Java 运算符

#### 算术运算符

| 操作符 | 描述 | 例子 |
| --- | --- | --- |
| + | 加法 - 相加运算符两侧的值 | A + B 等于 30 |
| - | 减法 - 左操作数减去右操作数 | A – B 等于 -10 |
| * | 乘法 - 相乘操作符两侧的值 | A * B等于200 |
| / | 除法 - 左操作数除以右操作数 | B / A等于2 |
| ％ | 取余 - 左操作数除以右操作数的余数 | B%A等于0 |
| ++ | 自增: 操作数的值增加1 | B++ 或 ++B 等于 21 |
| -- | 自减: 操作数的值减少1 | B-- 或 --B 等于 19 |

#### 关系运算符

| 运算符 | 描述 | 例子 |
| --- | --- | --- |
| == | 检查如果两个操作数的值是否相等，如果相等则条件为真。 | （A == B）为假。 |
| != | 检查如果两个操作数的值是否相等，如果值不相等则条件为真。 | (A != B) 为真。 |
| >  | 检查左操作数的值是否大于右操作数的值，如果是那么条件为真。 | （A> B）为假。 |
| <  | 检查左操作数的值是否小于右操作数的值，如果是那么条件为真。 | （A <B）为真。 |
| >= | 检查左操作数的值是否大于或等于右操作数的值，如果是那么条件为真。 | （A> = B）为假。 |
| <= | 检查左操作数的值是否小于或等于右操作数的值，如果是那么条件为真。 | （A <= B）为真。 |

#### 位运算符

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

#### 逻辑运算符

| -操作符 | 描述 | 例子 |
| --- | --- | --- |
| -&& | 称为逻辑与运算符。当且仅当两个操作数都为真，条件才为真。 | （A && B）为假。 |
| -| | 称为逻辑或操作符。如果任何两个操作数任何一个为真，条件为真。 | （A | | B）为真。 |
| -！ | 称为逻辑非运算符。用来反转操作数的逻辑状态。如果条件为true，则逻辑非运算符将得到false。 | ！（A && B）为真。 |

#### 赋值运算符

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

#### 条件运算符（?:）

条件运算符也被称为三元运算符。该运算符有3个操作数，并且需要判断布尔表达式的值。该运算符的主要是决定哪个值应该赋值给变量。  

variable x = (expression) ? value if true : value if false  

#### instanceof 运算符

该运算符用于操作对象实例，检查该对象是否是一个特定类型（类类型或接口类型）。

```java
String name = "James";
boolean result = name instanceof String; // 由于 name 是 String 类型，所以返回真
```

#### Java运算符优先级

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

### 1.5. Java 循环结构

#### while 循环

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

#### do…while 循环

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

#### for循环

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

#### break 关键字

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

#### continue 关键字

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

### 1.6. Java 条件语句

#### if 语句

```java
if(布尔表达式)
{
   //如果布尔表达式为true将执行的语句
}
```

#### if...else语句

```java
if(布尔表达式){
   //如果布尔表达式的值为true
}else{
   //如果布尔表达式的值为false
}
```

#### if...else if...else 语句

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

#### 嵌套的 if…else 语句

```java
if(布尔表达式 1){
   ////如果布尔表达式 1的值为true执行代码
   if(布尔表达式 2){
      ////如果布尔表达式 2的值为true执行代码
   }
}
```

### 1.7. Java switch case 语句

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

### 1.8. Java Number & Math 类

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

### 1.9. Java Character 类

Character 类用于对单个字符进行操作。

```java
char ch = 'a';
 
// Unicode 字符表示形式
char uniChar = '\u039A'; 
 
// 字符数组
char[] charArray ={ 'a', 'b', 'c', 'd', 'e' };
```

### 1.10. Java String 类

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

### 1.11. Java 数组

声明数组变量

```text
dataType[] arrayRefVar;   // 首选的方法
或
dataType arrayRefVar[];  // 效果相同，但不是首选方法
```










## 2. Kotlin
