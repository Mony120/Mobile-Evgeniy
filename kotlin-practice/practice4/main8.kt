fun main(){

    println("Выберете номер блюда:" +
            "1.Рис " +
            "2.Гречка " +
            "3.Доставка кфс " +
            "4.Овсянка " +
            "5.Яйца(Вареные) " +
            "6.Яйца(Жарененые) ")
    val a = readln().toInt()
    when(a){
        1 -> println("25 min")
        2 -> println("15 min")
        3 -> println("35 min")
        4 -> println("18 min")
        5 -> println("10 min")
        6 -> println("8 min")
        else -> println("нет выбранного блюда")
    }


}
