fun sum(arr :List<Int>):Int{
    var a = arr.sum()
    return a
}

fun main(){
    println("Введите элементы массива разделенных пробелами: ")
    val mass = readLine()!!.split(" ").map { it.toInt() }
    println("Сумма всех элементов - ${sum(mass)} ")

}