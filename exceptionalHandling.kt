fun main() {
checkAge(17)
}

fun checkAge (age: Int){
    if (age < 18){
        throw IllegalArgumentException("Age musy 18 or above")
    }
}