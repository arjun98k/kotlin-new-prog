package collection

fun main() {
    val num = listOf(11,12,13,14,15,16)
    val oddnum = num.filter { it %2 != 0 }
    val evenum = num.filter { it %2 == 0 }
    println("print odd number from list $oddnum")
    println("print even number from list $evenum")
}