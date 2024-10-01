import kotlin.random.Random
fun main(){
    println("Введите длину пароля:")
    var num = readln().toInt()
    var password:String = ""
    val lowercase = ('a'..'z')
    val uppercase = ('A'..'Z')
    val spez = listOf('!','@','#', '$','%','*')
    val number = (0..9)
    val randsimbol = lowercase + uppercase + spez + number
    for(i in 1..num){
        password += randsimbol.random()
    }
    println("Ваш сгенерированый пароль - $password")

}
