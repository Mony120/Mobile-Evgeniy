fun main(){
    println("Enter string")
    val str = readln()
    println("Times to repeat")
    val num = readln().toInt()
    println(strochka(str,num))
}

fun strochka(str:String, num:Int):String {
    return str.repeat(num)
}