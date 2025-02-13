fun main() {
printName("Akash")
    showMsg();
}


val printName: (String) -> Unit = { a:String -> println(a) }
var showMsg: () -> Unit ={ println("hello Arjun shet") }