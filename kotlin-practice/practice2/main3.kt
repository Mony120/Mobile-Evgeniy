fun main() {
    println("Vvedite pervoe chislo")
    val number: String = readln()
    val chislo1 = number.toFloat()
    println("Vvedite vtoroe chislo")
    val number1 = readln()
    val chislo2 = number1.toFloat()
    val delen:Float = chislo1 / chislo2
    val delen2:Float = chislo2 / chislo1
    println("Delenie 1 chislo na vtoroe ")
    println(delen)
    println("Delenie 2 chislo na pervoe")
    println(delen2)
}