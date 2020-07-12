package lesson1.if条件语句

import kotlin和java的区别.MyClass

fun main() {

    var num = 5
    if (num > 10) {

    } else {

    }

    //Kotlin里面if-else是一个表达式 -》结果
    val result = if (num > 10) "下载成功" else "下载失败"
    println(result)

    //if和else语句的最后内容就是这个表达式的返回值
    val res = if (num > 10) {
        println("$num>10")
        20
    } else {
        println("$num<10")
        "失败"
    }
    println(res)

    //三目运算符 问号表达式2》1？a:b
    //盼空表达式 a？：b
    var school = MyClass.getName()
    val result2 = school ?: "为空"
    println(result2)
}