package function

fun main() {
println(fact(5))
}

tailrec fun fact(n:Int, accumulator:Int =1):Int{
    return if (n==0)
        accumulator
     else  fact(n-1 ,n*accumulator)
    }

