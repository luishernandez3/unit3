fun main() {
    print("Enter a number between 1 and 10: ")
    val number = readLine()?.toIntOrNull()
    if (number != null && number in 1..10) {
        val romanNumeral = getRomanNumeral(number)
        println("The Roman numeral version of $number is $romanNumeral")
    } else {
        println("Error: Please enter a valid number between 1 and 10.")
    }
}
fun getRomanNumeral(number: Int): String {
    val romanNumerals = arrayOf("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X")
    return romanNumerals[number]
}
