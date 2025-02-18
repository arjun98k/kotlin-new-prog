package collection

fun main() {
    var mymap = mapOf<Int,String>(11 to "aksh",12 to "amita", 13 to "aditi")
//    for (key in mymap.keys){
//        println(mymap[key])
//    }
    var mymap2 = HashMap<Int, String>()
    mymap2.put(1,"aditya")
    mymap2.put(2,"amita")
    mymap2.put(3,"atul")

    mymap2.replace(3,"ajay")

    for (key in mymap2.keys){
        println("the index of mymap are  and the values are $key = ${mymap2[key]}")
    }

}