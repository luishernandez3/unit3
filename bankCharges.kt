fun main() {
    print("Enter the number of checks written this month: ")
    val numOfChecks = readLine()?.toInt() ?: 100

    var checkFee = 0.0
    when (numOfChecks) {
        in 0..19 -> checkFee = 0.10 * numOfChecks
        in 20..39 -> checkFee = 0.08 * numOfChecks
        in 40..59 -> checkFee = 0.06 * numOfChecks
        else -> checkFee = 0.04 * numOfChecks
    }
    val totalFee = checkFee + 10

    println("The bank's service fee for the month is: $$totalFee")
}
