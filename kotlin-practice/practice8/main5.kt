fun main(){
    println("Введите prob")
    val prob = readln().toInt()
    println("Введите prize")
    val prize = readln().toInt()
    println("Введите pay")
    val pay = readln().toInt()
    println(lolka(prob, prize, pay))

}
fun lolka(prob:Int, prize:Int, pay:Int): Boolean {
    var a = true
    if((prob * prize)>pay){
        return a
    }
    else{ a = false
        return a}
}