fun main(){
    println("Введите строку")
    var str = readln()
    println("Является ли палиндромом - ${palindrome(str)}")
}
fun palindrome(str:String):Boolean{
    if(str.reversed() == str){
        return true
    }
    else return false

}