fun main(){
    println("Введите число")
    val a = readln().toInt()
    var sum:Int = 0
    for(i in 1..a)
        sum +=i
    println(sum)


}