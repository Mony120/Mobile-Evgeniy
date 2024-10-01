fun main() {
    println("Введите количество рублей")
    var rub = readln().toDouble()
    println("Введи курс рубля к доллару")
    var usd = readln().toDouble()
    println("$rub руб в долларах - ${con(rub,usd)}")
}
fun con(rub:Double, usd:Double):Double{
    return rub/usd
}