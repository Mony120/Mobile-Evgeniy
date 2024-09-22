fun main(){
    val n:Int
    println("Vvedite 3 chisla")
    val a = readln().toInt();
    val c = readln().toInt();
    val b = readln().toInt()
    if((a==b) || (b==c) || (c==a)){
        println("error")}
    if((a > b) && (b > c))
        println("srednee chislo - $b")
    else if((b > a) && (a > c))
        println("srednee chislo - $a")
    else println("srednee chislo - $c")
}

