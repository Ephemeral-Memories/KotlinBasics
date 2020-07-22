package lesson3

/**
 * 数据类 Data Class
 * 数据模型
 * 只存放数据不涉及逻辑
 * 相当于Java的Model
 * 1、数据类的主构造函数必须至少一个参数
 * 2、参数必须使用var或val修饰（属性化变量）
 * 3、不能使用open inner abstruct (不能被继承、不能抽象化、做内部类、实现接口）
 *
 */
data class User(val name:String,
                val password:String,
                val id:Int){
}

fun main() {
    val u=User("Mark","123",1)
    println(u)//默认实现了toString()
    val u2=User("Mark","123",1).also {
        println(it) }
}
