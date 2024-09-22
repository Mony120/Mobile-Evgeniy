fun main(){
    println("Vvedite 2 chisla(сначало большее потом меньшее)")
    val m:Int
    val a = readln().toInt();
    val b = readln().toInt();
    if(a%b == 0){
        println("pervoe chislo kratno vtoromy")
    }
    else {
        m = a % b
        println("$m - ostatok ot delenia")
    }
}