fun main() {
//    divSion(11 , 0)

    try {
        val data = 10/5
        println(data)
    }catch (e: NullPointerException){
        println(e)
    }finally {
        println("this will always excutes")
    }
    println("remain codes")
}

//fun divSion(a: Int, b: Int): Int {
//      return try {
//        a/b
//    } catch (e: ArithmeticException) {
//        println("we cant divide by zero")
//        0
//    }
//}

