import kotlin.random.Random

fun main() {
    val deck = listOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace")
    println("Что бы начать играть нажмите 1 \nЧто бы выйти нажмите 2")
    var start = readln().toInt()
    when (start) {
        2 -> {
            println("До свидания")
            return
        }
    }
    println("Начнем игру")
    println("Правила: цифры на картах с цифрами показывают сколько это очков")
    println("Туз это 11 очков")
    println("Король это 4 очкa")
    println("Дама это 3 очка")
    println("Валет это 2 очка")
    var sumdealer = 0
    var sumplayer = 0
    while(sumplayer <= 21) {
        println("Вытянуть карту? да/нет")
        var perem = readln()
        if(perem == "да") {
            sumplayer += randomCard("да")
            println("У вас - $sumplayer")
            if (sumplayer == 21) {
                println("Вы выиграли!")
                return
            }
        }
         else if(perem == "нет"){
             println("Ваш счет - $sumplayer")
            println("Теперь ходит диллер")
            break
         }
        if(sumplayer > 21){
            println("Вы проиграли!")
            return
        }
    }
    while(sumdealer <= 21){
        sumdealer += randomCard("да")
        if (sumdealer == 21){
            println("Вы проиграли! у диллера $sumdealer!")
            return
        }
        else if(sumdealer > 21){
            println("У дилера - $sumdealer. Вы выиграли!")
            return
        }
    }
    println("У диллера - $sumdealer, у вас - $sumplayer")
    if(sumdealer > sumplayer){
        println("Вы проиграли!")
        return
    }
    else if(sumdealer == sumplayer){
        println("Ничья!")
    }
    else{
        println("Вы выиграли!")
    }
}
fun randomCard(str:String):Int {
    val deck = listOf("2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace")
    var randomIndex = Random.nextInt(deck.size)
    var randomElement = deck[randomIndex]
    var vrem = 0
    when (randomElement) {
        "2" -> vrem +=2
        "3" -> vrem += 3
        "4" -> vrem += 4
        "5" -> vrem +=5
        "6" -> vrem +=6
        "7" -> vrem +=7
        "8" -> vrem +=8
        "9" -> vrem +=9
        "10" -> vrem +=10
        "Jack" -> vrem +=2
        "Queen" -> vrem +=3
        "King" -> vrem +=4
        "Ace" -> vrem +=11
    }
    return when (str){
        "да" -> vrem
        else -> 0
    }
}