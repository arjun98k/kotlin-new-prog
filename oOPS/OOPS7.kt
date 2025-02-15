package oOPS

fun main() {
val obj11 = Bro()
    obj11.dMethod()
}


interface Amey {
    fun aMethod()

    fun bMethod()

}

interface Aditi {
    fun cMethod()

    fun dMethod()

}


class Bro: Amey, Aditi{
    override fun aMethod() {
        println("do some from aMethos")
    }

    override fun bMethod() {
        println("do some from bMethod")
    }

    override fun cMethod() {
       println("cMethod")
    }

    override fun dMethod() {
       println("dMethod")
    }
}