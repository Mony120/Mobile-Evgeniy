fun main(){
    println("Vvedite вашу оценку")
    val a = readln().toInt()
    when (a) {
        1 -> print("Кол")
        2 -> print("Двойка")
        3 -> print("Тройка")
        4 -> print("Четверка")
        5 -> print("Пятерка")
        else -> {
            print("неведомая оценка")
        }
    }

}