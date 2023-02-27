fun main() {
    // prompt user to enter weight in pounds and height in inches
    print("Enter weight in pounds: ")
    val weight = readLine()?.toDouble() ?: 0.0
    print("Enter height in inches: ")
    val height = readLine()?.toDouble() ?: 0.0

    // calculate BMI
    val bmi = weight * 703 / (height * height)

    // display BMI and weight status message
    println("BMI: $bmi")
    when {
        bmi < 18.5 -> println("Underweight")
        bmi in 18.5..25.0 -> println("Optimal weight")
        else -> println("Overweight")
    }
}
