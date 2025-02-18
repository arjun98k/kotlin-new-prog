package collection

fun main() {
    var set1 = setOf<Int>(11,12,13,13,14)

//    for (ak in set1){
//        println(ak)
//    }
    //set are sequnece store unique element
//hashset unsequence store unique element
    var hashset2 = hashSetOf<Int>(11,34,54,55,44)
    hashset2.remove(11)
    hashset2.sorted()
    for (bk in hashset2) {

    println(bk)
    }
}