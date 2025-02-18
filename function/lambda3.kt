package function
fun main() {
    val findOddEven: () -> Unit = {
        println("Please enter a number:")
        val num = readln().toInt()  // Converts the user input to an integer
        if (num % 2 == 0) {
            println("The number $num is even")
        } else {
            println("The number $num is odd")
        }
    }
    findOddEven()
}
