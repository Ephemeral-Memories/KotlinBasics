package lesson2.类和对象

fun main(){

    val bz=Car("奔驰")

    val s=Student("张三")
    println(s.name)
    s.name="李四"
    println(s.name)
    println(s.wife)

    val s2=Student()
    println(s2.name)

    //带名字的参数
    val s3=Student(wife = "as")
    println(s3.name+"--"+s3.wife)

}

//参数属性化并提供默认值：name前加上val或var 将参数自动变为类的属性 =：赋初值
class Student(var name:String="as",var wife:String=""){

}

//主构造函数 带有参数
//参数是局部变量 外部无法访问
//只有对象初始化的方法里面可以访问
class Car(brand:String){

    val myBrand=brand

    init {
        println(brand)
    }

    constructor(brand:String,color:String):this(brand){

    }


}