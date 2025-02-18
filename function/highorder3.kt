package function

fun greetmsg(name: String , greet:(String)->String):String{
    return greet(name)
}
fun main() {
val greetingmsg:(String)->String ={"$it kandekar "}

    val info = greetmsg("arjun",greetingmsg)
    println(info)
}