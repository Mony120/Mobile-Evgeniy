fun main(){
    println("Введите количество минут")
    val minute = readln().toInt()
    println("Enter kol-vo FPS")
    val fps = readln().toInt()
    var sec = minute * 60
    println("Кадров - ${ffppss(sec, fps)}")
}
fun ffppss(sec:Int, fps:Int):Int{
    return sec*fps
}