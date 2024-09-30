fun main(){
    println("Введите 1 число")
    var first = readln().toInt()
    println(maxx(first))
}

fun maxx(first:Int):Boolean{
    if(first%2 == 0) return true
    else return false
}