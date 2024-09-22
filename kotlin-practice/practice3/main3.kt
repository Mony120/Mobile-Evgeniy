fun main(){
    println("Vvedite 2 chisla")
    val a = readln().toInt();
    val b = readln().toInt();
    if(a%2 == 0){
        println("$b - nechetnoe")
    }
    else if(b%2 == 0){
        println("$a - nechetnoe")
    }
}