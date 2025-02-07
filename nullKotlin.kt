fun main() {
//    Nullable vs Non-Nullable Types
    var ak :String? = null
    println(ak)

//    Safe Call Operator (?.)
    var name: String? = null
    println(name?.length)  // This will return 'null' instead of throwing an exception

//    3. Elvis Operator (?:)
    var adi: String? = null
    val length = adi?.length ?: 0  // If 'name' is null, 'length' will be 0


}