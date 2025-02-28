package collection
fun String.buildMessage(): String{
    return this + "is awesome"
}

fun makeAdd(x: Int): (Int) -> Int {
    return {y -> x+y}
}
fun main() {
   val ans = "Arjun".buildMessage()
//    println(ans)
    val addsix = makeAdd(6)
    println(addsix(5))
    println("arjun")

    for (i in 1..10){
        println("hello")
    }

}