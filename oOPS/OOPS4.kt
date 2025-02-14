package oOPS

fun main() {
val ak = Person1("arjun", 14)
    println(ak.name)
}

class  Person1(nameparam:String, age:Int){
    var name:String = nameparam
        get(){
            return field.uppercase()
        }

}