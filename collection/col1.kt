package collection

fun main() {
    var listi1 = listOf< String>("adi", "aksh","arjun")

    for (index in 0..listi1.size-1){
        println("list of element $index " + listi1[index])
    }
}