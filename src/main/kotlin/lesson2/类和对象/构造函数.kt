package lesson2.类和对象

fun main(){

    //实例化对象 直接调用构造函数
    val a=Person2()

    val b=Person3()
}

/**
 * kotlin构造函数分两种
 * 1、主构造函数 类的头部
 * 2、次构造函数 类的内部
 */

//默认提供一个无参构造函数
class Person{

}

class Person1(){

}

//通过constructor关键字显示指定 这是构造函数
//当有修饰的时候constructor不能省略private constructor
//init方法在创建对象时自动调用
class Person2 constructor(){
    init {
        println("init方法....")
    }
}

//提供一个次构造函数
//次构造函数必须显示调用主构造函数 this() {}
class Person3(){

    constructor(name:String) : this() {

    }

    constructor(name: String,age:Int) : this() {

    }

}



