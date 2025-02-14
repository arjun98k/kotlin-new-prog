package oOPS

fun main() {
var ak = Person1("arjun", 50)
    println(ak.name)
  ak.age = 40
    println(ak.age)
}

class  Person1(nameparam:String, ageParam:Int) {
    var name: String = nameparam
        get() {
            return field.uppercase()
        }
    var age: Int = ageParam
        set(value) {
            if (value > 0) {
                field = value
            } else {
                println("value is negative")
            }

        }
}