fun main() {
    println("Выберите вашу кровь: 1.А 2.В 3.АВ 4.О")
    val a = readln().toInt()
    when (a) {
        1 -> println("Для переливания можно использовать: A, O.")
        2 -> println("Для переливания можно использовать: B, O.")
        3 -> println("Для переливания можно использовать: A, B, AB, O.")
        4 -> println("Для переливания можно использовать: O.")
        else -> println("Некорректная группа крови. ")
    }
}