package function
fun applyOperation(value: Int, operation:(Int)->Int):Int{
    return operation(value)
}
fun main() {
val addsix : (Int) ->Int ={it + 6}
val res=    applyOperation(5,addsix)
    println(res)
}