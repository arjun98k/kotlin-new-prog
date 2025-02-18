package collection

fun main() {
    //immutable list in collection
    var listi1 = listOf< String>("adi", "aksh","arjun")

//    for (index in 0..listi1.size-1){
//        println("list of element $index " + listi1[index])
//    }

    var list2 = mutableListOf< String>( "amit","adwait","ajay" )
    list2.add(3,"atul")

//    for (index in 0..list2.size-1){
//        println("list2 element $index "+ list2[index])
//    }

    var list3 = arrayListOf<String>("amita","aditi")
    list3.add(2,"swara")
        for (index in 0..list3.size-1){
        println("list3 element $index "+ list3[index])
    }
}