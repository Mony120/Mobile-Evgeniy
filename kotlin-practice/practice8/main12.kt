fun main(){
    println("enter number")
    val num = readln().toInt()
    println("g${repeater(num)}gle")
}

fun repeater(num:Int):String{
    val o = "o"
    return o.repeat(num)
}