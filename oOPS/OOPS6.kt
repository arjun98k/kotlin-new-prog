package oOPS

fun main() {
val obj1 = Arj()
    obj1.absmethod()
    obj1.printmsg()
}

interface Aksh {
    fun absmethod()

    fun printmsg(){
        print("it will print some msg")
    }

}

class Arj : Aksh{
    override fun absmethod() {
        println("this abs method of interface implement in Arj class")
    }
}