fun main(){
    println("Vvedite dvyznachnoe chislo")
    val number : String = readln()
    val number1: Int = number.toInt()
    val number2 = number1 / 10
    val number3 = number1 % 10
    val number4 = number2 + number3
    val number5 = number2 * number3
    println("Chislo desatkov")
    println(number2)
    println("Chislo edinic")
    println(number3)
    println("Summa cifr")
    println(number4)
    println("proizvedenie cifr")
    println(number5)
}