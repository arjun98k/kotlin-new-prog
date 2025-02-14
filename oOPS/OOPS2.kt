package oOPS

fun main() {
val obj = Person("arjun", 17)
    val obj1 = Person("aditya", 20)
val ak = obj1.whoCanVote()
    println(obj1.name + obj1.whoCanVote())
}


class Person(val name:String ,var age:Int){
  fun  whoCanVote(): Boolean {
       return age > 18
    }
}