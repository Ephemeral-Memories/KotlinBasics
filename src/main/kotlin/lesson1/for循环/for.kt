package lesson1.for循环

fun main() {

    //使用..表示范围
    for (i in 1..10) {
        print("$i ")
    }

    println()

    //使用step改变增量
    for (i in 1..10 step 2) {
        print("$i ")
    }

    println()

    //使用downTo递减
    for (i in 10 downTo 1) {
        print("$i ")
    }

    println()

    for (i in 10 downTo 1 step 2) {
        print("$i ")
    }

    println()

    var names = arrayOf("a", "b", "c")
    for (i in 0..names.size - 1) {
        println(names[i])
    }

    //until:不包括最后一个值
    for (i in 0 until names.size) {
        println(names[i])
    }

    //foreach
    for (name in names) {
        println(name)
    }

    //获取对应索引值
    for (i in names.indices) {
        println(names[i])
    }

    for ((index, item) in names.withIndex()) {
        println("$index--$item")
    }

}