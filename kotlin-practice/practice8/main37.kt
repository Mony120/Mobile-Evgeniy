fun main(){
    println("Введите число")
    var num = readln().toInt()
    println(tabl(num))
}
fun tabl(num:Int){
    for(i in 1..10){
        println("$num*$i=${num*i}")
    }
}