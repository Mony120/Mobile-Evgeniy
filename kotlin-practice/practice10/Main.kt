fun main(){
    println("Введите число:")
    var num = readln().toInt()
    println(printNumber(num).joinToString(","))
}

fun printNumber(num: Int): List<Int> {
    if (num == 0) {
        return emptyList()
    }
    val list = mutableListOf<Int>()
    for (i in num downTo 1) {
        list.add(i)
    }
    return list
}