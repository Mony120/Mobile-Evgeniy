fun main() {
    val x:Boolean = true; val y:Boolean = true; val z:Boolean = false
    print("X = $x  Y = $y  Z = $z\n")
    print("a) ${!x and y}   ")
    print("б) ${x or !y}   ")
    print("в) ${x or y and z}   ")
}