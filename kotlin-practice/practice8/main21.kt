fun main(){
    val mass = arrayOf(32,22,12,46,5,6,100)
    println(mass.toString())
    println("Отсортированный массив - ${sort(mass).joinToString(" ") }}")

}

fun sort(mass:Array<Int>): Array<Int> {
    return mass.sortedArray()
}