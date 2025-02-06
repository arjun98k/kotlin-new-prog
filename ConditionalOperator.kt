fun main() {
    println("enter your test number")
    val num: Int =Integer.valueOf(readLine())

    val res = if (num > 0){
        println("given number is positive $num")
    }else if( num < 0){
        println("given number is negative $num")
    }else
    {
        println("num is zero")
    }


}