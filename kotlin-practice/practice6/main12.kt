import kotlin.random.Random

fun main(){
    val mass = Array<Int>(10, { Random.nextInt(1, 25)})
    println("${mass.joinToString(", ")}")
     println("Введите индекс элемента который хотите поменять:")
    val r1 = readln().toInt()
    print("Введите индекс элемента который хотите поменять:")
    val r2 = readln().toInt()
    var tmp = mass[r1]
    mass[r1] = mass[r2]
    mass[r2] = tmp
    println("Измененный массив ${mass.joinToString(", ")}")
}