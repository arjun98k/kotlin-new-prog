package collection

fun main() {
    val myNum: List<Int> = listOf(11,33,5,65,30)

    val mySmallNum = myNum.filter { it < 50 }.map { it * it } // it * it == {num -> num *num}
   for (a in mySmallNum){
   println( (a))

   }
}
