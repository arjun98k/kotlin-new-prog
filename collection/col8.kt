package collection
fun main() {


    val bk:() -> Unit ={
        val age = readLine()!!.toInt()
        if (age  >= 18 ){
            print("he can drive")
        }
    }
    bk()
}
