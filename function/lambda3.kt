package function

fun main() {
    val findOddEven: () -> Unit= {
        val num = 13
        if (num%2 == 0) {
            println("the num is even")
        }else{
            println("the num is odd")
        }
    }
   findOddEven()
}
