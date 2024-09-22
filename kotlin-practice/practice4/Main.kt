fun main(){
    println("Vvedite nomer dnya nedeli")
    val a = readln().toInt()
    when (a) {
        1 -> print("monday")
        2 -> print("vtornik")
        3 -> print("Sreda")
        4 -> print("Chetverg")
        5 -> print("Friday")
        6 -> print("Subota")
        7 -> print("sunday")
        else -> {
            print("неверно введен день недели")
        }
    }
}