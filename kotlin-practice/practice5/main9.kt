fun main() {
    println("Введите строку:")
    val str1 = readLine()
    if (str1 != null) {
        val reversStr = str1.reversed()//.reversed Отображает в обратном порядке
        println("Строка в обратном порядке: $reversStr")
    } else {
        println("Введи нормально плз")
    }
}