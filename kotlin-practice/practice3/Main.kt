//
fun main(){
    val n: Int
    val  m: Int
    println("Vveddite 3 chisla")
   val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    if(a > b) {
        n = a
    } else{
        n = b;
    }
    if(n > c){
        m = n
    }
    else {
        m = c
    }
    println("$m - max chislo")
}

