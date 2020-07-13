package lesson2.类和对象

/**
 * 在已有类的基础上添加新的方法和属性
 * 1、继承
 * 2、函数扩展
 */

fun main() {
    Child("as").show()
    Child("as").work()

}

//kotlin里面类默认不能被继承 添加open关键字
open class Animal() {

}

open class Father(var name: String, var age: Int = 30) : Animal() {

    //open:允许子类重写 默认不能被重写
    open fun work() {
        println("父类工作")
    }
}

//只能单继承 间接继承
class Child(name: String) : Father(name, 40) {
    fun show() {
        println("my name is $name age is $age")
    }

    //子类重写父类方法override
    override fun work(){
        //使用super调用父类方法
        super.work()
        println("子类重写工作")
    }
}






