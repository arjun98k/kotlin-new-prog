package collection
fun main() {
    val ak:()-> Unit = {val a=14; val b=15; println(a+b)}
    ak()
    val bk:() -> Unit ={
        val age = readLine()!!.toInt()
        if (age  >= 18 ){
            print("he can drive")
        }
    }
    bk()
}
