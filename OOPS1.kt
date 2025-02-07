class OOPS1(val make: String, val model: String, var year: Int) {
fun drive(){
    println("the $make and $model of car")
}
}

fun main() {
val mycar = OOPS1("Tata", "xuv 500",2012)
    mycar.drive()
}