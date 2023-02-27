fun main() {
    print("Enter the month: ")
    val month = readLine()?.toInt() ?: 2

    print("Enter the day: ")
    val day = readLine()?.toInt() ?: 26

    print("Enter the two-digit year: ")
    val year = readLine()?.toInt() ?: 23

    if (month * day == year) {
        println("The date is magic!")
    } else {
        println("The date is not magic.")
    }
}
