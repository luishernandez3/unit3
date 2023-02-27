fun main() {
    // Ask the user to enter three names
    print("Enter the first name: ")
    val name1 = readLine()!!
    print("Enter the second name: ")
    val name2 = readLine()!!
    print("Enter the third name: ")
    val name3 = readLine()!!

    val names = listOf(name1, name2, name3)

    val sortedNames = names.sorted()

    println("The names in ascending order are:")
    for (name in sortedNames) {
        println(name)
    }
}
