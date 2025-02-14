package oOPS

fun main() {
val obj = Car("maruti", 60, 25)
    val obj2= Car("nexa", 65, 21)
    obj.driveCar()
    obj.infoCar()
    obj2.infoCar()
}

class  Car(val name:String, val speed:Int, var range:Int){
    fun driveCar(){
        println("car name is $name")
    }
    fun infoCar(){
        println("speed of car is $speed and range is $range")
    }
}