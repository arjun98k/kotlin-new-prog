import com.sun.jdi.IntegerValue

fun main() {
    println("enter your week number")
    var number: Int= Integer.valueOf(readLine())
    when (number){
        1 -> {
            println("today is monday")
        }
        2 -> {
            println("today is tuesday")
        }
        3 -> {
            println("today is wednesday")
        }
        4 -> {
            println("today is thursday")
        } else ->{
            println("this not day exist")
        }
    }
}