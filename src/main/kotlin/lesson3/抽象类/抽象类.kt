package lesson3.抽象类

/**
 * 抽象类里面可以定义
 * 抽象属性
 * 抽象方法
 * 普通方法
 * 子类必须实现 就定义为抽象方法 否则为普通方法
 *
 * 抽象类默认是open
 * 如果要重写抽象类普通方法 必须使用open修饰
 */
abstract class BaseActivity{
    abstract var title:String
    init {
        run()
    }
    fun run(){
        //创建界面
        onCreate()
        //暂停界面
        onPause()
        //销毁页面
        onDestory()

    }

    abstract fun onCreate()

     open fun onPause(){

    }

    open fun onDestory(){

    }


}