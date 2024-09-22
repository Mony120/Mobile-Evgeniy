fun main(){
    println("Свою цифру")
    val a = readln().toInt()
    when{
        a > 0 -> print("положительное")
        a < 0 -> print("отрицательное")
        else -> print("это нуль")
    }


}