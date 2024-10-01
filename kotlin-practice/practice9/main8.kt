import kotlin.random.Random
fun main(){
    println("Это игра угадай число")
    var randNum = (Random.nextInt(1,100))
    println("Число загаданно, введи ваше число:")
    var polzNum = readln().toInt()
    while(polzNum != 0){
        if(polzNum == randNum){
            println("Вы угадали!")
            break
        }
        else if(polzNum>randNum){
            println("Загаданное число меньше, введите еще предположение")
            polzNum = readln().toInt()
        }
        else if(polzNum<randNum){
            println("Загаданное число больше, введите еще предположение")
            polzNum = readln().toInt()
        }


    }
}