fun main(){
    println("Enter string:")
    var str = readln()
    var str2:String = ""
    str.forEach {
        when{
            it.isLowerCase() -> str2 += it.uppercaseChar()
            else -> str2 += it.lowercaseChar()
        }
    }
    println("Ваша строка теперь - $str2")

}