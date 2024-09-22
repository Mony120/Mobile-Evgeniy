fun main() {

    var game = true
    var l = ""
    while(game){
        println("Введите число A")
        var a = readln()
        var b = a.toInt()

        println("Введите число B")
        var c = readln()
        var d = c.toInt()

        println("$b * $d = ${b*d}")

        println("$b + $d = ${b+d}")

        println("Продолжить?\n \nда - enter \nнет - стоп\n")
        l = readln()
        if(l == "стоп"){
            println("\nУдачи!!!")
            game = false
        }
    }
}