fun main(){
    println("Введите первое число")
    val first = readln().toInt()
    println("Введите второе число")
    val second = readln().toInt()
    println(sigma(first, second))
}

fun sigma(first:Int, second:Int):Boolean {
    var a = true
    if((first+second)<100){
        return a
    }
    else{
        a = false
        return a
    }
}