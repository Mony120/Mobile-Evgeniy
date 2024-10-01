fun main(){
    println("Введите первую строку")
    var str1 = readln()
    println("Введите вторую строку")
    var str2 = readln()
    println("Являются ли аннаграмами - ${annagram(str1,str2)}")
}
fun annagram(str1:String,str2:String):Boolean{
    var str1mass = str1.toCharArray()
    var str2mass = str1.toCharArray()
    return str1mass contentEquals  str2mass
}