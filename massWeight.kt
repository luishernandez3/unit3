fun main() {
    print("Enter the object's mass in kilograms: ")
    val mass = readLine()?.toDouble() ?: 1.0

    val weight = mass * 9.8

    if (weight > 1000) {
        println("The object is too heavy!")
    } else if (weight < 10) {
        println("The object is too light!")
    } else {
        println("The object's weight is $weight Newtons.")
    }
}
