fun main(){
    println("Введите число")
    var num = readln().toInt()
    println(fuk(num))
}
fun fuk(num:Int):Int{
    var a = 1

    for(i in 1..num){
        a *=i
    }
    return a
}