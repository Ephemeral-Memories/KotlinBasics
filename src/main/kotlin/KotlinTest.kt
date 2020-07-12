fun main(){

    val java=JavaTest()
    println(java.name)
    println(java.name.length)

    //空指针安全 类型可空
    val name:String? =java.name;

    loadData(Impl())
    //匿名类
    loadData(object :KotlinReq{
        override fun onSuccess() {
            println("下载成功")
        }
    })

    load {
        print("$it")
    }

}

fun load(req: (String)->Unit){

}
fun loadData(req: KotlinReq){
    req.onSuccess()
}

interface KotlinReq{
    fun onSuccess()
}

class Impl:KotlinReq{
    override fun onSuccess() {
        println("下载成功")
    }

}


class KotlinClass(val name:String){
    fun show(){
        println("name is $name")
    }
}



