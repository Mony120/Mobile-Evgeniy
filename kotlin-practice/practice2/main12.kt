fun main() {
    val a:Boolean = true; val b:Boolean = false; val c:Boolean = false
    print("A = $a  B = $b  C = $c\n")
    print("a) ${a or !(a and b) or c}   ")
    print("б) ${!a or a and (b or c)}   ")
    print("в) ${(a or b and !c) and c}    ")
}