fun main(){
    println("Введите число")
    var num = readln().toInt()
    println("${prost(num)}")
}

fun prost(num:Int):Boolean{
    for(i in 2..num/2){
        if(num%i == 0)
            return false
    }
    return true
}
