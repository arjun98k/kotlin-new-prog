package function

fun main() {
    val lambda4 : String.(Int) -> String = { this + it }
   val res = "Arjun".lambda4(98)
//    println(res)

    val sqr:(Int)->Int = { it*it}
    println(sqr(5))
}