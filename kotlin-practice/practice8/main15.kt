fun main(){
    println("Введите 1 число")
    var first = readln().toInt()
    println("Введите 2 число")
    var second = readln().toInt()
    println(summa(first,second))
}

fun summa(first:Int, second:Int):Int{
    if(first>second){
        return first
    }
    else{
        return second
    }

}