
var n = 0
fun printNum(){
    n++
    if ( n <= 5){
        println(n)
        printNum()
    }

}


fun main() {
    printNum()
}

