package lesson3

fun show(){

}

//Unit == void
fun buy(money:Int):Unit{

}

fun study(money:Int):Int{
    //...

    return 8000
}


fun add(a:Int,b: Int):Int{
    return a+b
}
fun add2(a:Int,b:Int)=a+b

//默认参数
fun work(money:Int=6000,name:String,type:String="Android"){

}

//可变参数
fun add(vararg names:Int){
    var result=0;
    for (v in names){
        result+=v
    }
    println(result)
}

//localFunction 局部函数
fun showView(){
    fun loadData()="图片"
    fun showList(){
        //下载数据
        val img=loadData()
        //展示
        println("显示下载内容：$img")
    }
    showList()
}

fun showView2(){
    fun loadData()="图片"//it指代返回值
    fun showList(){
        //下载数据
        loadData().also {
            println("显示下载内容：$it") }
    }
    showList()
}

fun main(){
    work(8000,"小王")
    work(name = "AS")

    add(1,2,3,4)

    showView()
    showView2()
}




