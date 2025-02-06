import java.util.Scanner
fun main() {
    println("enter the value of a")
    var a: Int =Integer.valueOf(readLine())
    println("enter the value of b")
    var b: Int =Integer.valueOf(readLine())


    if (a > b){
        println("a is greater than b max $a")
    }else{
        println("b is greater than  a max $b")
    }
}