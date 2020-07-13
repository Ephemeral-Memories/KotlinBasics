package lesson2.类和对象

/**
 * 默认定义属性是会自动创建对应的set或get方法
 * val 常量属性 只有get
 * var 变量属性 get、set
 * kotlin类的属性声明的同时必须有初值 初始化
 * 可以重写默认的set、get方法
 * 默认情况下任何一个属性都有一个内部变量 名字就是field
 * 这个变量只能在初始化的时候调用 get、set
 */

class Shape() {
    var name: String = "as"
        //定义的时候直接给值
        set(value) {
            field = value.toUpperCase()
        }
        get() = field.toLowerCase()

    //设置外部访问 只读
    var pwd: String = "1234"
        private set

}

class Boy {
    //可空类型：？
    /**
     * 使用场景：
     * 1、声明变量时不确定有没有值
     * 2、接收Java的返回值
     */
    var girlFriend: String? = null

    fun show() {
        //对于可空类型的对象调用时必须使用？
        println(girlFriend?.length)
        //明确指定这个对象一定不为空
        //println(girlFriend!!.length)
    }
}

class Activity{

    //懒加载 当这个常量被调用的时候在会有值
    val data:String by lazy {
        "下载的数据"
    }

    fun showActivity(){
        println("显示加载的数据：$data")
    }

    //延迟加载 这个变量必须在某个时候初始化
    lateinit var imgdata:String

    fun showActivity2(){
        imgdata="测试数据"
        println("显示加载的数据：$imgdata")
    }
}

fun main() {

    Boy().show()

    val shape = Shape()
    shape.name = "as"
    println(shape.name)

    Activity().showActivity()
    Activity().showActivity2()
}

