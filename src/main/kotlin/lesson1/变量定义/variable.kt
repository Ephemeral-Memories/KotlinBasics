package lesson1.变量定义

fun main() {
    //var 定义变量
    //val 定义常量

    //定义时明确指定类型
    val pi: Double = 3.14
    //类型自动推导
    val name = "hhh"

    var temp = 20
    var score = 98.2
    temp = 30

    //类型安全 不一样的类型不能复制
    //通过Number类提供的to方法转换
    score=temp.toDouble()
    temp=score.toInt()

}