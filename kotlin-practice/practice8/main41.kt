fun main(){
    println("ведите строку на русском!")
    val str = readln()
    println("Столько гласных в вашей строке - ${glas(str)}")

}
fun glas(str:String):Int{
    var sum = 0
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
        }
    }
    return sum
}