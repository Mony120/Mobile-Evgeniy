fun main(){
    println("Vvedite длины cторон треугольнка")
    val a = readln().toFloat()
    val b = readln().toFloat()
    val c = readln().toFloat()
    if((a<=0)||(b<=0)||(c<=0)) {
        println("ТАкого треугольника быть не может")
        return
    }
    when{
        a == b || a == c || c == b -> println("Равнобедренный ")
        (a == b) && (b == c) -> println("Равностороний")
        else -> println("Разностороний")
    }
}