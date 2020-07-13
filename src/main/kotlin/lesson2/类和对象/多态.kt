package lesson2.类和对象

open class Animal2(){
    open fun sleep(){
        println("动物冬眠")
    }
}

class Dog():Animal2(){
    override fun sleep(){
        println("狗在家冬眠")
    }
}

fun whereToSleep(animal:Animal2){
    animal.sleep()

}

interface OnClickListener{
    fun onClick()
}

class BUtton: OnClickListener{
    override fun onClick() {
        println("按钮被点击了")
    }

}
class Image: OnClickListener{
    override fun onClick() {
        println("图片被点击了")
    }

}

fun test(listener:OnClickListener){
    listener.onClick()
}

fun main(){

    val an=Animal2()
    val dg=Dog()

    //父类接收子类类型
    whereToSleep(an)
    whereToSleep(dg)

    //统一接口
    test(BUtton())
    test(Image())

}


