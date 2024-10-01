fun main(){
    println("Введите какую нибудь строку на русском")
    var str = readln()
println("Вот столько гласных и согласных букв - (Гласные, согласные)")
    println(glas(str))
}
fun glas(str:String):Pair<Int,Int>{
    var sum = 0
    var sums = 0
    for(glas in str){
        when(glas){
            'а' -> sum++
            'и' -> sum++
            'е' -> sum++
            'о' -> sum++
            'ю' -> sum++
            'я' -> sum++
            'э' -> sum++
            'ё' -> sum++
            else -> sums++
        }
    }
    return sum to sums
}