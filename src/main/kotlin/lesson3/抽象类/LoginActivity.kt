package lesson3.抽象类

class LoginActivity() :BaseActivity(){
    override var title: String="登录页面"

    override fun onCreate() {
        println("搭建-----")
    }

    override fun onPause() {
        super.onPause()
        println("暂停--------")
    }

    override fun onDestory() {
        super.onDestory()
        println("销毁-----------")
    }
}