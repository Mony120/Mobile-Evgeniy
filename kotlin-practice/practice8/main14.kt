fun main(){
    println("Введите 1 число")
    var first = readln().toInt()
    println("Введите 2 число")
    var second = readln().toInt()
    println(sum(first,second))
}

fun sum(first:Int, second:Int):Int{
    return first+second

}