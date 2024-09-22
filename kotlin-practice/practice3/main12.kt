fun main() {
    println("Vvedite dvyznachnoe chislo")
    val a = readln().toInt();
    val b:Int = a%10
    val c:Int = a/10
    if(b > c){
        println("a) pervaya bolshe")
    }
    else if (c > b)
        println("a) vtoraya bolshe")
    else println("b) cifri odinakovi")

}