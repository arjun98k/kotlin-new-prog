fun main() {
    oddAndEven(11)
}

fun oddAndEven(num1:Int):Unit = if (num1 %2 == 0){
    println("$num1 it is even number")
}else{
    println("it is odd number")
}