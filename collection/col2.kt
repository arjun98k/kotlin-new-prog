package collection

fun main() {
    var mymap = mapOf<Int,String>(11 to "aksh",12 to "amita", 13 to "aditi")
    for (key in mymap.keys){
        println(mymap[key])
    }

}