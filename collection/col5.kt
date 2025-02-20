package collection

fun main() {
    val num = listOf(11,12,13,14,15,16)
    val oddnum = num.filter { it %2 != 0 }
    val evenum = num.filter { it %2 == 0 }
    println(oddnum)
    println(evenum)
}