package collection

fun main() {
    val myNum: List<Int> = listOf(11,33,5,65,30)

//    val mySmallNum = myNum.filter { it < 50 }.map { it * it } // it * it == {num -> num *num}
    val mySmallNum = myNum.filter{myNum-> if (myNum%2 == 0) { println("num is even"); true} else {println("num is odd");  false} }
   for (a in mySmallNum){
   println( (a))

   }
}
