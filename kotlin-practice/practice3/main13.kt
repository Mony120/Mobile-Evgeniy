fun main(){
    println("vvedite 4-x znachnoe chislo")
    val a = readln().toInt();
    val b:Int = a / 1000//1 chislo
    val c:Int = ((a/100)%10)//2 chislo
    val d:Int = ((a%100)/10)//3 chislo
    val m:Int = ((a%100)%10)//4 chislo
    //a)
    if(b+c == d + m)
        println("a) ravna")
    else println("a) ne ravna")
//b)
    if((a + b + c + m)%3 == 0)
        println("b) kratna")
    else println("b) ne kratna")
//c)
    if((a * b * c * m)%4 == 0)
        println("c) kratna")
    else println("c) ne kratna")
//d)
    println("vvedite chislo kratnost kotorogo bydem proveryat")
    val n = readln().toInt();
    if((a * b * c * m)%n == 0)
        println("d) kratno")
    else println("d) ne kratno")
}