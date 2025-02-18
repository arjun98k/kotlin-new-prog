package collection

fun main() {
    var listi1 = listOf< String>("adi", "aksh","arjun")

//    for (index in 0..listi1.size-1){
//        println("list of element $index " + listi1[index])
//    }

    var list2 = mutableListOf< String>( "amit","adwait","ajay" )
    list2.add(3,"atul")

    for (index in 0..list2.size-1){
        println("list2 element $index "+ list2[index])
    }
}