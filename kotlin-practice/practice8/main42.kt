fun main() {
    val mass = arrayOf(1,2,3,4,5,6,7,8,9)
    println("${mass.joinToString(" ")}")
    println("Введите элемент")
    val num = readln().toInt()
    val index = index(mass, num)
    if (index != -1) {
        println("Индекс первого вхождения: $index")
    } else {
        println("$num не найден")
    }
}
fun index(mass:Array<Int>,a:Int):Int{
    for (i in mass.indices) {//indices способ перебора к индексу
        if (mass[i] == a) {
            return i
        }
    }
    return -1
}
