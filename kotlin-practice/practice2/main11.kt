fun main() {
    val x:Boolean = false; val y:Boolean = false; val z:Boolean = true
    print("X = $x  Y = $y  Z = $z\n")
    print("a) ${(x or y and !z)}   ")
    print("г) ${x and !y or z}   ")
    print("б) ${!x and !y}   ")
    print("д) ${(x and(!y or z))}   ")
    print("в) ${!(x and z) or y}   ")
    print("е) ${(x or (!(y or z)))}   ")
}