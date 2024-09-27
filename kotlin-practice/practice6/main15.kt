fun main() {
    println("Введите строку:")
    val str1 = readLine().toString()
    var str2 = str1.reversed()//.reversed Отображает в обратном порядке

    if(str1 == str2){
        println("Это палиндром")
    }
    else{
        println("No")
    }
}