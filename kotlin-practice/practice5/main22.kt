import kotlin.random.Random
fun main(){
    val randchislo = Random.nextInt(1, 100) // рандомное число от 1 до 5
    println("Это игра угадай число от 1 до 5")
    println("Введи вариант")
    val chisloPolz = readln().toInt()
    when{
        (chisloPolz < 1)||(chisloPolz > 5) -> print("Введите правильно число!!!!")
        chisloPolz == randchislo -> println("Вы угадали")
        else -> println("Вы не угадали:(")

    }
}