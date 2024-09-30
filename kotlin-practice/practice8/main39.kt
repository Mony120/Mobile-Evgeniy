fun main(){
    val mass = arrayOf(1,2,3,4,5,6,7,8,9,0)
    println(mass.joinToString(" "))
    println("Перевернутый массив - ${rever(mass).joinToString(" ") }")
}
fun rever(mass:Array<Int>): Array<Int> {
    return mass.reversedArray()
}