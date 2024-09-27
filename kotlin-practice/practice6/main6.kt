fun main(){
    var mass = arrayOf(1, 2, 6, 4, 3, 7, 3,14, 65, 32)
    var mass2 = mutableListOf<Int>()
    var mass3 = mutableListOf<Int>()
    for(i in 0..mass.size - 1){
        if(mass[i]%2 == 0){
           mass2.add(mass[i])
        }
        else{
            mass3.add(mass[i])
        }

    }

    println("Nechetni: ${mass2.joinToString()}}")
    println("Nechetni: ${mass3.joinToString()}}")
}
