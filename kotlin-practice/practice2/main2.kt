fun main(){
    println("Vvedite trexznachnoe chislo")
    val number : String = readln()
    val number1: Int = number.toInt()
    val xz = number1 / 10
    val sot = number1 / 100//поиск сотен
    val des = xz % 10 //поиск десятков
    val eden = number1 % 10//посик едениц
    val sum = eden + sot + des//поиск суммы
    val ymnoz = eden * des * sot//поиск произведения
    println("Chislo desatkov")
    println(des)
    println("Chislo edenic")
    println(eden)
    println("Chislo soten")
    println(sot)
    println("Proizvedenie")
    println(ymnoz)
    println("summa")
    println(sum)

}