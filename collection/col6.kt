package collection

fun main() {
    val num = listOf(1,2,3,4,5,6,7,8)
    val haseven = num.any{ it % 2 == 0 }
    println(haseven)
}