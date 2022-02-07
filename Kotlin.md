# Kotlin

Kotlin 是一种在 Java 虚拟机上运行的静态类型编程语言，被称之为 Android 世界的Swift，由 JetBrains 设计开发并开源。  

Kotlin 可以编译成Java字节码，也可以编译成 JavaScript，方便在没有 JVM 的设备上运行。  

为什么选择 Kotlin？  
简洁: 大大减少样板代码的数量。  
安全: 避免空指针异常等整个类的错误。  
互操作性: 充分利用 JVM、Android 和浏览器的现有库。  
工具友好: 可用任何 Java IDE 或者使用命令行构建。  

- [Kotlin](#kotlin)
  - [1. Kotlin 使用命令行编译](#1-kotlin-使用命令行编译)
    - [SDKMAN](#sdkman)
    - [在 OS X 下，你可以使用 Homebrew 安装](#在-os-x-下你可以使用-homebrew-安装)
  - [2. Kotlin 基础语法](#2-kotlin-基础语法)
    - [包声明](#包声明)
    - [默认导入](#默认导入)
    - [函数定义](#函数定义)
    - [可变长参数函数](#可变长参数函数)
    - [lambda(匿名函数)](#lambda匿名函数)
    - [定义常量与变量](#定义常量与变量)
    - [字符串模板](#字符串模板)
    - [NULL检查机制](#null检查机制)
    - [类型检测及自动类型转换](#类型检测及自动类型转换)
    - [区间](#区间)
  - [3. Kotlin 基本数据类型](#3-kotlin-基本数据类型)
    - [字面常量](#字面常量)
    - [比较两个数字](#比较两个数字)
    - [类型转换](#类型转换)
    - [位操作符](#位操作符)
    - [字符](#字符)
    - [布尔](#布尔)
    - [数组](#数组)
    - [字符串](#字符串)
    - [字符串模板](#字符串模板-1)
  - [4. Kotlin 条件控制](#4-kotlin-条件控制)
    - [IF 表达式](#if-表达式)
    - [使用区间](#使用区间)
    - [When 表达式](#when-表达式)
  - [5. Kotlin 循环控制](#5-kotlin-循环控制)
    - [For 循环](#for-循环)
    - [while 与 do...while 循环](#while-与-dowhile-循环)
    - [返回和跳转](#返回和跳转)
    - [Break 和 Continue 标签](#break-和-continue-标签)
    - [标签处返回](#标签处返回)
  - [6. Kotlin 类和对象](#6-kotlin-类和对象)
    - [类的属性](#类的属性)
    - [getter 和 setter](#getter-和-setter)
    - [主构造器](#主构造器)
    - [次构造函数](#次构造函数)
    - [抽象类](#抽象类)
    - [嵌套类](#嵌套类)
    - [内部类](#内部类)
    - [匿名内部类](#匿名内部类)
    - [类的修饰符](#类的修饰符)
  - [7. Kotlin 继承](#7-kotlin-继承)

## 1. Kotlin 使用命令行编译

### SDKMAN

```text
curl -s https://get.sdkman.io | bash
sdk install kotlin
```

### 在 OS X 下，你可以使用 Homebrew 安装

```text
brew update
brew install kotlin
```

创建一个名为 hello.kt 文件，代码如下：  

```java
fun main(args: Array<String>) {
    println("Hello, World!")
}
```

使用 Kotlin 编译器编译应用:

```text
kotlinc hello.kt -include-runtime -d hello.jar
```

1. -d: 用来设置编译输出的名称，可以是 class 或 .jar 文件，也可以是目录。
2. -include-runtime : 让 .jar 文件包含 Kotlin 运行库，从而可以直接运行。

## 2. Kotlin 基础语法

### 包声明

```kt
package com.runoob.main

import java.util.*

fun test() {}
class Runoob {}
```

kotlin源文件不需要相匹配的目录和包，源文件可以放在任何文件目录。  

以上例中 test() 的全名是 com.runoob.main.test、Runoob 的全名是 com.runoob.main.Runoob。  

如果没有指定包，默认为 default 包。  

### 默认导入

有多个包会默认导入到每个 Kotlin 文件中：  

kotlin.*  
kotlin.annotation.*  
kotlin.collections.*  
kotlin.comparisons.*  
kotlin.io.*  
kotlin.ranges.*  
kotlin.sequences.*  
kotlin.text.*  

### 函数定义

函数定义使用关键字 fun，参数格式为：参数 : 类型

```kt
fun sum(a: Int, b: Int): Int {   // Int 参数，返回值 Int
    return a + b
}
```

表达式作为函数体，返回类型自动推断：

```kt
fun sum(a: Int, b: Int) = a + b

public fun sum(a: Int, b: Int): Int = a + b   // public 方法则必须明确写出返回类型
```

无返回值的函数(类似Java中的void)：

```kt
fun printSum(a: Int, b: Int): Unit { 
    print(a + b)
}


// 如果是返回 Unit类型，则可以省略(对于public方法也是这样)：
public fun printSum(a: Int, b: Int) { 
    print(a + b)
}
```

### 可变长参数函数

函数的变长参数可以用 vararg 关键字进行标识：

```kt
fun vars(vararg v:Int){
    for(vt in v){
        print(vt)
    }
}

// 测试
fun main(args: Array<String>) {
    vars(1,2,3,4,5)  // 输出12345
}
```

### lambda(匿名函数)

```kt
fun main(args: Array<String>) {
    val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
    println(sumLambda(1,2))  // 输出 3
}
```

### 定义常量与变量

可变变量定义：var 关键字

```text
var <标识符> : <类型> = <初始化值>
```

不可变变量定义：val 关键字，只能赋值一次的变量(类似Java中final修饰的变量)

```text
val <标识符> : <类型> = <初始化值>
```

常量与变量都可以没有初始化值,但是在引用前必须初始化  

编译器支持自动类型判断,即声明时可以不指定类型,由编译器判断。  

```kt
val a: Int = 1
val b = 1       // 系统自动推断变量类型为Int
val c: Int      // 如果不在声明时初始化则必须提供变量类型
c = 1           // 明确赋值


var x = 5        // 系统自动推断变量类型为Int
x += 1           // 变量可修改
```

### 字符串模板

$ 表示一个变量名或者变量值  

$varName 表示变量值  

${varName.fun()} 表示变量的方法返回值  

```kt
var a = 1
// 模板中的简单名称：
val s1 = "a is $a" 

a = 2
// 模板中的任意表达式：
val s2 = "${s1.replace("is", "was")}, but now is $a"
```

### NULL检查机制

Kotlin的空安全设计对于声明可为空的参数，在使用时要进行空判断处理，有两种处理方式，字段后加!!像Java一样抛出空异常，另一种字段后加?可不做处理返回值为 null或配合?:做空判断处理  

```kt
//类型后面加?表示可为空
var age: String? = "23" 
//抛出空指针异常
val ages = age!!.toInt()
//不做处理返回 null
val ages1 = age?.toInt()
//age为空返回-1
val ages2 = age?.toInt() ?: -1
```

当一个引用可能为 null 值时, 对应的类型声明必须明确地标记为可为 null。  

当 str 中的字符串内容不是一个整数时, 返回 null:  

```kt
fun parseInt(str: String): Int? {
  // ...
}
```

### 类型检测及自动类型转换

我们可以使用 is 运算符检测一个表达式是否某类型的一个实例(类似于Java中的instanceof关键字)。  

```kt
fun getStringLength(obj: Any): Int? {
  if (obj is String) {
    return obj.length 
  }

  return null
}
```

或者

```kt
fun getStringLength(obj: Any): Int? {
  if (obj !is String)
    return null
  // 在这个分支中, `obj` 的类型会被自动转换为 `String`
  return obj.length
}
```

### 区间

区间表达式由具有操作符形式 .. 的 rangeTo 函数辅以 in 和 !in 形成。  

```kt
for (i in 1..4) print(i) // 输出“1234”

for (i in 4..1) print(i) // 什么都不输出

if (i in 1..10) { // 等同于 1 <= i && i <= 10
    println(i)
}

// 使用 step 指定步长
for (i in 1..4 step 2) print(i) // 输出“13”

for (i in 4 downTo 1 step 2) print(i) // 输出“42”


// 使用 until 函数排除结束元素
for (i in 1 until 10) {   // i in [1, 10) 排除了 10
     println(i)
}
```

## 3. Kotlin 基本数据类型

Kotlin 的基本数值类型包括 Byte、Short、Int、Long、Float、Double 等。不同于 Java 的是，字符不属于数值类型，是一个独立的数据类型。

| 类型 | 位宽度 |
| --- | --- |
| Double | 64 |
| Float | 32 |
| Long | 64 |
| Int | 32 |
| Short | 16 |
| Byte | 8 |

### 字面常量

十进制：123  
长整型以大写的 L 结尾：123L  
16 进制以 0x 开头：0x0F  
2 进制以 0b 开头：0b00001011  
注意：8进制不支持  

Kotlin 同时也支持传统符号表示的浮点数值：  

Doubles 默认写法: 123.5, 123.5e10  
Floats 使用 f 或者 F 后缀：123.5f  

可以使用下划线使数字常量更易读：

```text
val oneMillion = 1_000_000
val creditCardNumber = 1234_5678_9012_3456L
val socialSecurityNumber = 999_99_9999L
val hexBytes = 0xFF_EC_DE_5E
val bytes = 0b11010010_01101001_10010100_10010010
```

### 比较两个数字

在 Kotlin 中，三个等号 === 表示比较对象地址，两个 == 表示比较两个值大小。

```kt
fun main(args: Array<String>) {
    val a: Int = 10000
    println(a === a) // true，值相等，对象地址相等

    //经过了装箱，创建了两个不同的对象
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    //虽然经过了装箱，但是值是相等的，都是10000
    println(boxedA === anotherBoxedA) //  false，值相等，对象地址不一样
    println(boxedA == anotherBoxedA) // true，值相等
}
```

### 类型转换

由于不同的表示方式，较小类型并不是较大类型的子类型，较小的类型不能隐式转换为较大的类型。 这意味着在不进行显式转换的情况下我们不能把 Byte 型值赋给一个 Int 变量。

```kt
val b: Byte = 1 // OK, 字面值是静态检测的
val i: Int = b // 错误
```

可以代用其toInt()方法。

```text
val b: Byte = 1 // OK, 字面值是静态检测的
val i: Int = b.toInt() // OK
```

每种数据类型都有下面的这些方法，可以转化为其它的类型：

```text
toByte(): Byte
toShort(): Short
toInt(): Int
toLong(): Long
toFloat(): Float
toDouble(): Double
toChar(): Char
```

有些情况下也是可以使用自动类型转化的，前提是可以根据上下文环境推断出正确的数据类型而且数学操作符会做相应的重载。例如下面是正确的：

```kt
val l = 1L + 3 // Long + Int => Long
```

### 位操作符

对于Int和Long类型，还有一系列的位操作符可以使用，分别是：

```text
shl(bits) – 左移位 (Java’s <<)
shr(bits) – 右移位 (Java’s >>)
ushr(bits) – 无符号右移位 (Java’s >>>)
and(bits) – 与
or(bits) – 或
xor(bits) – 异或
inv() – 反向
```

### 字符

和 Java 不一样，Kotlin 中的 Char 不能直接和数字操作，Char 必需是单引号 ' 包含起来的。比如普通字符 '0'，'a'。

### 布尔

布尔用 Boolean 类型表示，它有两个值：true 和 false。  

内置的布尔运算有：  

|| – 短路逻辑或  
&& – 短路逻辑与  
! - 逻辑非  

### 数组

数组用类 Array 实现，并且还有一个 size 属性及 get 和 set 方法，由于使用 [] 重载了 get 和 set 方法，所以我们可以通过下标很方便的获取或者设置数组对应位置的值。  

数组的创建两种方式：一种是使用函数arrayOf()；另外一种是使用工厂函数.  

```kt
fun main(args: Array<String>) {
    //[1,2,3]
    val a = arrayOf(1, 2, 3)
    //[0,2,4]
    val b = Array(3, { i -> (i * 2) })

    //读取数组内容
    println(a[0])    // 输出结果：1
    println(b[1])    // 输出结果：2
}
```

### 字符串

和 Java 一样，String 是不可变的。方括号 [] 语法可以很方便的获取字符串中的某个字符，也可以通过 for 循环来遍历：

```kt
for (c in str) {
    println(c)
}
```

Kotlin 支持三个引号 """ 扩起来的字符串，支持多行字符串，比如：

```kt
fun main(args: Array<String>) {
    val text = """
    多行字符串
    多行字符串
    """
    println(text)   // 输出有一些前置空格
}
```

### 字符串模板

模板表达式以美元符（$）开头，由一个简单的名字构成:

```kt
fun main(args: Array<String>) {
    val i = 10
    val s = "i = $i" // 求值结果为 "i = 10"
    println(s)
} 
```

或者用花括号扩起来的任意表达式:

```kt
fun main(args: Array<String>) {
    val s = "runoob"
    val str = "$s.length is ${s.length}" // 求值结果为 "runoob.length is 6"
    println(str)
}
```

## 4. Kotlin 条件控制

### IF 表达式

一个 if 语句包含一个布尔表达式和一条或多条语句。

```kt
// 传统用法
var max = a 
if (a < b) max = b

// 使用 else 
var max: Int
if (a > b) {
    max = a
} else {
    max = b
}
 
// 作为表达式
val max = if (a > b) a else b
```

不需要像Java那种有一个三元操作符，因为我们可以使用它来简单实现：

```kt
val c = if (condition) a else b
```

### 使用区间

使用 in 运算符来检测某个数字是否在指定区间内，区间格式为 x..y ：

```kt
fun main(args: Array<String>) {
    val x = 5
    val y = 9
    if (x in 1..8) {
        println("x 在区间内")
    }
}
```

### When 表达式

when 将它的参数和所有的分支条件顺序比较，直到某个分支满足条件。  

when 既可以被当做表达式使用也可以被当做语句使用。如果它被当做表达式，符合条件的分支的值就是整个表达式的值，如果当做语句使用， 则忽略个别分支的值。  

when 类似其他语言的 switch 操作符。

```kt
when (x) {
    1 -> print("x == 1")
    2 -> print("x == 2")
    else -> { // 注意这个块
        print("x 不是 1 ，也不是 2")
    }
}
```

如果很多分支需要用相同的方式处理，则可以把多个分支条件放在一起，用逗号分隔：

```kt
when (x) {
    0, 1 -> print("x == 0 or x == 1")
    else -> print("otherwise")
}
```

也可以检测一个值在（in）或者不在（!in）一个区间或者集合中：

```kt
when (x) {
    in 1..10 -> print("x is in the range")
    in validNumbers -> print("x is valid")
    !in 10..20 -> print("x is outside the range")
    else -> print("none of the above")
}
```

## 5. Kotlin 循环控制

### For 循环

for 循环可以对任何提供迭代器（iterator）的对象进行遍历，语法如下:

```text
for (item in collection) print(item)
```

通过索引遍历一个数组或者一个 list

```kt
for (i in array.indices) {
    print(array[i])
}
```

用库函数 withIndex

```kt
for ((index, value) in array.withIndex()) {
    println("the element at $index is $value")
}
```

### while 与 do...while 循环

```kt
while( 布尔表达式 ) {
  //循环内容
}
```

do…while 循环和 while 循环相似，不同的是，do…while 循环至少会执行一次。

```kt
do {
       //代码语句
}while(布尔表达式);
```

### 返回和跳转

Kotlin 有三种结构化跳转表达式：  

return。默认从最直接包围它的函数或者匿名函数返回。  
break。终止最直接包围它的循环。  
continue。继续下一次最直接包围它的循环。  

```kt
fun main(args: Array<String>) {
    for (i in 1..10) {
        if (i==3) continue  // i 为 3 时跳过当前循环，继续下一次循环
        println(i)
        if (i>5) break   // i 为 6 时 跳出循环
    }
}
```

### Break 和 Continue 标签

在 Kotlin 中任何表达式都可以用标签（label）来标记。 标签的格式为标识符后跟 @ 符号，例如：abc@、fooBar@都是有效的标签。 要为一个表达式加标签，我们只要在其前加标签即可。

```kt
loop@ for (i in 1..100) {
    // ……
}
```

可以用标签限制 break 或者continue：

```kt
loop@ for (i in 1..100) {
    for (j in 1..100) {
        if (……) break@loop
    }
}
```

标签限制的 break 跳转到刚好位于该标签指定的循环后面的执行点。 continue 继续标签指定的循环的下一次迭代。

### 标签处返回

从 lambda 表达式中返回，我们必须给它加标签并用以限制 return。

```kt
fun foo() {
    ints.forEach lit@ {
        if (it == 0) return@lit
        print(it)
    }
}
```

通常情况下使用隐式标签更方便。 该标签与接受该 lambda 的函数同名。

```kt
fun foo() {
    ints.forEach {
        if (it == 0) return@forEach
        print(it)
    }
}
```

## 6. Kotlin 类和对象

Kotlin 类可以包含：构造函数和初始化代码块、函数、属性、内部类、对象声明。  

Kotlin 中使用关键字 class 声明类，后面紧跟类名：  

```kt
class Runoob {  // 类名为 Runoob
    // 大括号内是类体构成
}
```

### 类的属性

类的属性可以用关键字 var 声明为可变的，否则使用只读关键字 val 声明为不可变。

```kt
class Runoob {
    var name: String = ……
    var url: String = ……
    var city: String = ……
}
```

我们可以像使用普通函数那样使用构造函数创建类实例：

```kt
val site = Runoob() // Kotlin 中没有 new 关键字
```

要使用一个属性，只要用名称引用它即可

```kt
site.name           // 使用 . 号来引用
site.url
```

Koltin 中的类可以有一个 主构造器，以及一个或多个次构造器，主构造器是类头部的一部分，位于类名称之后:

```kt
class Person constructor(firstName: String) {}
```

如果主构造器没有任何注解，也没有任何可见度修饰符，那么constructor关键字可以省略。

```kt
class Person(firstName: String) {
}
```

### getter 和 setter

属性声明的完整语法：

```kt
var <propertyName>[: <PropertyType>] [= <property_initializer>]
    [<getter>]
    [<setter>]
```

getter 和 setter 都是可选  

如果属性类型可以从初始化语句或者类的成员函数中推断出来，那就可以省去类型，val不允许设置setter函数，因为它是只读的。  

```kt
var allByDefault: Int? // 错误: 需要一个初始化语句, 默认实现了 getter 和 setter 方法
var initialized = 1    // 类型为 Int, 默认实现了 getter 和 setter
val simple: Int?       // 类型为 Int ，默认实现 getter ，但必须在构造函数中初始化
val inferredType = 1   // 类型为 Int 类型,默认实现 getter
```

非空属性必须在定义的时候初始化,kotlin提供了一种可以延迟初始化的方案,使用 lateinit 关键字描述属性：

```kt
public class MyTest {
    lateinit var subject: TestSubject

    @SetUp fun setup() {
        subject = TestSubject()
    }

    @Test fun test() {
        subject.method()  // dereference directly
    }
}
```

### 主构造器

主构造器中不能包含任何代码，初始化代码可以放在初始化代码段中，初始化代码段使用 init 关键字作为前缀。

```kt
class Person constructor(firstName: String) {
    init {
        println("FirstName is $firstName")
    }
}
```

> 注意：主构造器的参数可以在初始化代码段中使用，也可以在类主体n定义的属性初始化代码中使用。 一种简洁语法，可以通过主构造器来定义属性并初始化属性值（可以是var或val）：

```kt
class People(val firstName: String, val lastName: String) {
    //...
}
```

### 次构造函数

类也可以有二级构造函数，需要加前缀 constructor:

```kt
class Person { 
    constructor(parent: Person) {
        parent.children.add(this) 
    }
}
```

如果类有主构造函数，每个次构造函数都要，或直接或间接通过另一个次构造函数代理主构造函数。在同一个类中代理另一个构造函数使用 this 关键字：

```kt
class Person(val name: String) {
    constructor (name: String, age:Int) : this(name) {
        // 初始化...
    }
}
```

如果一个非抽象类没有声明构造函数(主构造函数或次构造函数)，它会产生一个没有参数的构造函数。构造函数是 public 。如果你不想你的类有公共的构造函数，你就得声明一个空的主构造函数：

```kt
class DontCreateMe private constructor () {
}
```

example

```kt
class Runoob  constructor(name: String) {  // 类名为 Runoob
    // 大括号内是类体构成
    var url: String = "http://www.runoob.com"
    var country: String = "CN"
    var siteName = name

    init {
        println("初始化网站名: ${name}")
    }
    // 次构造函数
    constructor (name: String, alexa: Int) : this(name) {
        println("Alexa 排名 $alexa")
    }

    fun printTest() {
        println("我是类的函数")
    }
}

fun main(args: Array<String>) {
    val runoob =  Runoob("菜鸟教程", 10000)
    println(runoob.siteName)
    println(runoob.url)
    println(runoob.country)
    runoob.printTest()
}
```

### 抽象类

抽象是面向对象编程的特征之一，类本身，或类中的部分成员，都可以声明为abstract的。抽象成员在类中不存在具体的实现。

```kt
open class Base {
    open fun f() {}
}

abstract class Derived : Base() {
    override abstract fun f()
}
```

### 嵌套类

把类嵌套在其他类中

```kt
class Outer {                  // 外部类
    private val bar: Int = 1
    class Nested {             // 嵌套类
        fun foo() = 2
    }
}

fun main(args: Array<String>) {
    val demo = Outer.Nested().foo() // 调用格式：外部类.嵌套类.嵌套类方法/属性
    println(demo)    // == 2
}
```

### 内部类

内部类使用 inner 关键字来表示。  

内部类会带有一个对外部类的对象的引用，所以内部类可以访问外部类成员属性和成员函数。  

```kt
class Outer {
    private val bar: Int = 1
    var v = "成员属性"
    /**嵌套内部类**/
    inner class Inner {
        fun foo() = bar  // 访问外部类成员
        fun innerTest() {
            var o = this@Outer //获取外部类的成员变量
            println("内部类可以引用外部类的成员，例如：" + o.v)
        }
    }
}

fun main(args: Array<String>) {
    val demo = Outer().Inner().foo()
    println(demo) //   1
    val demo2 = Outer().Inner().innerTest()   
    println(demo2)   // 内部类可以引用外部类的成员，例如：成员属性
}
```

为了消除歧义，要访问来自外部作用域的 this，我们使用this@label，其中 @label 是一个 代指 this 来源的标签。

### 匿名内部类

使用对象表达式来创建匿名内部类：

```kt
class Test {
    var v = "成员属性"

    fun setInterFace(test: TestInterFace) {
        test.test()
    }
}

/**
 * 定义接口
 */
interface TestInterFace {
    fun test()
}

fun main(args: Array<String>) {
    var test = Test()

    /**
     * 采用对象表达式来创建接口对象，即匿名内部类的实例。
     */
    test.setInterFace(object : TestInterFace {
        override fun test() {
            println("对象表达式创建匿名内部类的实例")
        }
    })
}
```

### 类的修饰符

类的修饰符包括 classModifier 和_accessModifier_:  

classModifier: 类属性修饰符，标示类本身特性。  

abstract    // 抽象类  
final       // 类不可继承，默认属性  
enum        // 枚举类  
open        // 类可继承，类默认是final的  
annotation  // 注解类  
accessModifier: 访问权限修饰符  

private    // 仅在同一个文件中可见  
protected  // 同一个文件中或子类可见  
public     // 所有调用的地方都可见  
internal   // 同一个模块中可见  

## 7. Kotlin 继承

