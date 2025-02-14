package oOPS

fun main() {
val ob1 = Dog()
    ob1.sound()

}

open class  Animal{
        open fun sound(){
        println("animal make sound")
    }
}

class Dog: Animal() {
    fun play() {
        println("dogs play")
    }
       override fun sound(){
            println("dog barks")
        }

    }

