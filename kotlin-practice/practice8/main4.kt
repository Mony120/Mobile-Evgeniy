fun lol(prob:Int, prize:Int, pay:Int): Boolean {
    var a = true
    if((prob * prize)>pay){
        return a
    }
    else{ a = false
        return a}
}

fun main(){
    println("Введите prob")
    val prob = readln().toInt()
    println("Введите prize")
    val prize = readln().toInt()
    println("Введите pay")
    val pay = readln().toInt()
    println(lol(prob, prize, pay))

}
