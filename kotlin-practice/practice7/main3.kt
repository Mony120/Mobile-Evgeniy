fun main(){
    println("Введите количество побед")
    var wins = readln().toIntOrNull()
    println("Введите количество ничьих")
    var nichi = readln().toIntOrNull()
    println("Введите количество поражений")
    var loses = readln().toIntOrNull()
    if((wins == null)||(loses == null)||(nichi == null)){
        println("Введите нормальные значения")
        return
    }
    var wins2 = (wins*2)+nichi
    println(" Количество очков - $wins2")



}