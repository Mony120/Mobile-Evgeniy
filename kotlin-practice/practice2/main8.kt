fun main() {
    val a:Boolean = true; val b:Boolean = false; val c:Boolean = false
    print("A = $a  B = $b  C = $c\n")
    print("a) ${!a and b}   ")
    print("б) ${a or !b}   ")
    print("в) ${a and b or c}    ")
}