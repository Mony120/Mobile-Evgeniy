fun main(){
    println("Введите целое число")
    val num = readln().toInt()
    println(kek(num))
}

fun kek(num:Int):Boolean{
    if(num%100 == 0) return true

    else return false

}