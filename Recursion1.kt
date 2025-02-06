fun main() {
println(Rec(5))
}
fun Rec(n:Int):Long {
  return if (n ==1){
         n.toLong()
    }
    else {
         n*Rec(n-1)
    }
}