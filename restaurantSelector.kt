fun main() {
    println("Is anyone in your party a vegetarian? ")
    val isVegetarian = readLine()?.equals("yes", ignoreCase = true) ?: false
    
    println("Is anyone in your party a vegan? ")
    val isVegan = readLine()?.equals("yes", ignoreCase = true) ?: false
    
    println("Is anyone in your party gluten-free? ")
    val isGlutenFree = readLine()?.equals("yes", ignoreCase = true) ?: false
    
    val restaurantChoices = mutableListOf<String>()
    
    if (!isVegetarian || !isVegan || !isGlutenFree) {
        restaurantChoices.add("Joe's Gourmet Burgers")
    }
    
    if (isVegetarian && isGlutenFree) {
        restaurantChoices.addAll(listOf("Main Street Pizza Company", "Corner Café", "The Chef's Kitchen"))
    } else if (isVegetarian) {
        restaurantChoices.addAll(listOf("Main Street Pizza Company", "Corner Café", "The Chef's Kitchen", "Mama's Fine Italian"))
    } else if (isGlutenFree) {
        restaurantChoices.addAll(listOf("Main Street Pizza Company", "Corner Café", "The Chef's Kitchen"))
    } else {
        restaurantChoices.addAll(listOf("Main Street Pizza Company", "Corner Café", "The Chef's Kitchen", "Mama's Fine Italian"))
    }
    
    println("Here are your restaurant choices:")
    restaurantChoices.forEach { println(it) }
}
