fun main() {
//    oddAndEven(11)
//    love(5)
    love() // default argyment
}

fun oddAndEven(num1:Int):Unit = if (num1 %2 == 0){
    println("$num1 it is even number")
}else{
    println("it is odd number")
}

fun love(num1:Int =3){
    for (a in 1..num1 ) println("happy valentine $a")
}