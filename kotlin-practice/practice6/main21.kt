

fun main(){
    val mass = mutableListOf(1,23,12,6,3,44,12,55,41)
    println("${mass.joinToString(", ")}")
    println("Введите индекс элемента который хотите удалить")
    val del = readln().toInt()
    mass.removeAt(del)
    println("${mass.joinToString(", ")}")


}