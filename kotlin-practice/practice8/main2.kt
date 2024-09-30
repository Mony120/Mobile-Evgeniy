fun razn(arr:List<Int>): Int {
    var max = arr.max()
    var min = arr.min()
    var a = max-min
    return a

}
fun main(){
    println("Введите элементы массива разделенных пробелами: ")
    val mass = readLine()!!.split(" ").map { it.toInt() }
    println("Разность максимального и минимального - ${razn(mass)} ")
}
