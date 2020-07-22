package lesson3

//接口 默认open
//接口不能被实例化 只能实例化接口的实现类
interface OnTouchListener{
    fun onTouchEvent(type:String)
}

fun didTouch(listener:OnTouchListener){
    listener.onTouchEvent("手指按下")
}

/**
 * 方法1、定义类实现接口 -》实例化实现类
 */
class ButtonListener:OnTouchListener{
    override fun onTouchEvent(type: String) {
        println("接受到事件为：$type")
    }

}

fun main() {
//    var btn=ButtonListener()
//    didTouch(btn)
    ButtonListener().apply {
        didTouch(this)
    }

    ButtonListener().also {
        didTouch(it)
    }


    /**
     * 方法2、匿名类的方式
     */
    didTouch(object :OnTouchListener{
        override fun onTouchEvent(type: String) {
            println("接受到事件为：$type")
        }
    })

}

class QQQ{

    fun show(){
        //匿名内部类
        dispatchTouch(object :OnTouchListener{
            override fun onTouchEvent(type: String) {
                println("接受到事件为：$type")
            }
        })
    }

    fun dispatchTouch(listener:OnTouchListener){
        listener.onTouchEvent("手指划定")
    }

}