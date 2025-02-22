package collection
fun String.buildMessage(): String{
    return this + "is awesome"
}
fun main() {
   val ans = "Arjun".buildMessage()
    println(ans)
}