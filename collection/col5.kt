package collection

fun main() {
    val num = listOf(11,12,13,14,15,16)
    val evennum = num.filter { it %2 == 0 }
    println(evennum)
}