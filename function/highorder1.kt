package function
fun mulfac(factor:Int): (Int) -> Int {
    return {num -> num * factor}
}
fun main() {
val multri = mulfac(3)
    println(multri(2))
}