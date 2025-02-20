package collection

fun main() {
    val num = listOf(1,2,3,4,5,6,7,8)
    val haseven = num.any{ it % 2 == 0 }
    println(haseven)
    val haseven1 = num.all{ it % 2 == 0 }
    println(haseven1)
    val haseven2 = num.none{ it % 2 == 0 }
    println(haseven2)
    val haseven3 = num.find{ it % 2 == 0 }
    println(haseven3)
}