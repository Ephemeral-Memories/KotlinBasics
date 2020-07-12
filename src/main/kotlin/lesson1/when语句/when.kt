package lesson1.when语句

fun main() {
    val num = 20
    //switch 更简洁
    when (num) {
        10 -> println("10")
        30 -> println("30")
        40 -> println("40")
        else -> println("其他")
    }

    //更灵活
    when (num) {
        in 1..10 -> println("Z")
        in 11..59 -> println("E")
        in 60..90 -> println("A")
        else -> println("无")
    }

    //更方便
    val result = when (num) {
        10 -> 'A'
        11 -> 'B'
        else -> "other"
    }

    println(result)



}