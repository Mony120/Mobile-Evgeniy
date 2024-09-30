fun main(){
    println("Введите k")
    val k = readln().toInt()
    println("Enter n")
    val n = readln().toInt()
    println(sosiska(k, n))
}

fun sosiska(k:Int, n:Int):Boolean{
    if((k*k)==n) return true
    else return false
}