fun main(){
    println("Введите  первое число")
    val first = readln().toInt()
    println("Введите  второе число")
    val second = readln().toInt()
    var x = first
    var y = second
    while(y!=0){
        val vrem = y; y = x % y; x = vrem
    }
    println("НОД для двух ваших чисел это $x ")


}