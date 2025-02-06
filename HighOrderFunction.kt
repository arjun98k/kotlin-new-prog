fun main() {
sumTwo(98,11, {})
}

fun sumTwo(num1: Int, num2: Int , callback: ()-> Unit){
    println("hello callback is ${num1 + num2}")
    callback()  }