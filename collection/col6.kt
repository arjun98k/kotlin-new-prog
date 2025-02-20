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
    val haseven4 = num.filter{ it % 2 == 0 }.map { it *2 }
    println(haseven4)
}