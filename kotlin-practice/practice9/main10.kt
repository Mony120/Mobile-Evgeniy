fun main(){
println("Введите строку с разными словами")
    var str = readln()
    var splittenStr = str.split(Regex("\\S+"))
    var a = splittenStr.filter { it.isNotEmpty() }
        .maxBy { it.length }
    println("Самое длинное слово - $a")
}
