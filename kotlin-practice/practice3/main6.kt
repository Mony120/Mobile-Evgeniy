fun main(){
    println("Vvedite year")
    val a = readln().toInt();
    if(a%4==0)
        println("$a - visikosniy")
    else println("$a - ne visokostniy")
}