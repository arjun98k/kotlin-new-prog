package oOPS

import kotlin.reflect.full.memberProperties // Correct import for member properties

fun main() {

}
    // Create an object using the secondary constructor
    val obj = Adi("car1", "petrol")

    // Create another object using the primary constructor
    val obj1 = Adi("aditi", 44, 4, 4, "petrol")

    // Iterate through the properties of the object using reflection


class Adi(val name: String, var speed: Int, val seat: Int, val tyre: Int, val car_type: String) {
    // Primary constructor
    init {
        println("This initializer 1")
    }

    // Secondary constructor
    constructor(nameParam: String, engineParam: String) : this(nameParam, 20, 4, 4, engineParam) {
        println("Secondary constructor")
    }
}
