class OOPS2{
    var acc_no: Int = 0
    var name: String = ""
    var amount: Float = 0.toFloat()

    // Function to initialize account details
    fun insert(ac: Int, n: String, am: Float) {
        acc_no = ac
        name = n
        amount = am
        println("Account no: $acc_no holder: $name amount: $amount")
    }

    // Function to deposit money
    fun deposit(depositAmount: Float) {
        if (depositAmount > 0) {
            amount += depositAmount
            println("Deposited $depositAmount. New balance: $amount")
        } else {
            println("Invalid deposit amount.")
        }
    }

    // Function to withdraw money
    fun withdraw(withdrawAmount: Float) {
        if (withdrawAmount > 0 && withdrawAmount <= amount) {
            amount -= withdrawAmount
            println("Withdrew $withdrawAmount. New balance: $amount")
        } else {
            println("Invalid withdraw amount or insufficient balance.")
        }
    }

    // Function to check the current balance
    fun checkBalance() {
        println("Current balance: $amount")
    }
}

fun main() {
    var obj1 = OOPS2()
    obj1.insert(128,"arjun",500f)
    println("account holder info ${obj1.name}")
    println("account has deposit ${obj1.deposit(700f)}")
    println("account has withdraw ${obj1.withdraw(200f)}")
}