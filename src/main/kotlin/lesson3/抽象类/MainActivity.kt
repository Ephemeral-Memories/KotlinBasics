package lesson3.抽象类

class MainActivity(override var title: String) :BaseActivity(){
    override fun onCreate() {
        println("主界面--------")
    }
}