package oOPS

fun main() {
var  obj = Adi("car1","petrol")
    println(obj.seat)

}

class Adi(val name:String, var speed:Int,val seat:Int, val tyre:Int , val car_type:String)  // primary constructor
{
    init {
        println("$name this intializer 1")
    }

    constructor(nameParam:String, engineParam:String): this(nameParam,20,4,4,engineParam) // secondary constructor
}