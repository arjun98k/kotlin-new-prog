fun main() {
    println(sum(98,11))
    printfun("akash")



}

var sum:(Int, Int)  -> Int =  {a, b -> a+b }
var printfun:(String) ->Unit  = {a-> println(a) }