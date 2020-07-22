package lesson3

class Bank{
    var money:Money= Money(0)

    /**
     * 嵌套类 Nested 相当于Java的静态类
     * 独立 不能访问宿主类的属性、方法
     */
    class Money(var num:Int){}

    /**
     * 内部类 inner
     * 能访问宿主类的属性、方法
     */
    inner class Card(){
        fun save(count:Int){
            money.num+=count
        }

        fun withDraw(count:Int){
            if(money.num>=count){
                money.num-=count
                println("取款成功 余额为${money.num}")
            }else{
                println("余额不足")
            }
        }
    }
}

fun main() {
    //嵌套类创建
    //Bank.Money(0)

    //内部类创建
    val card=Bank().Card()
    card.save(2000)
    card.withDraw(500)

}