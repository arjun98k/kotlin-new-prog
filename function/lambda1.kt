package function



fun main() {
val ak = { println("hii") }
    ak()



    val summ = {a:Int, b:Int ->  a+b}
   println( summ(11,13))


    val addd:(Int, Int) -> Int = {d, c -> d+c}
    println(addd(98,23))
}

