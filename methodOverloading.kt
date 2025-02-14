fun main() {
val fn: (a:Int, b:Int) -> Int = ::sum
    println(fn(11,12))
val fn2:(a:Double, b:Double)-> Double = ::sum
    println(fn2(11.20,98.20))
}

fun sum(a:Int, b:Int):Int{
    return a+b
}
fun sum(a:Double,b:Double):Double{
    return a+b
}