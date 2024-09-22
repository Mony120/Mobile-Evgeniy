fun main(){
    println("веди ваше число");
    var a = readln().toInt()
    var sum:Int = 0
    while (a != 0) {
        sum += a % 10
        a /= 10
    }
    println("Сумма цифр вашего числа это $sum")

}