package Collections_in_Kotlin

import kotlin.collections.iterator

// A Map is a collection consisting of keys and values.
// It's called a map because unique keys are mapped to other values.
// A key and its accompanying value are often called a key-value pair.

fun main() {

    val solarSystem = mutableMapOf(
        "Mercury" to 0,
        "Venus" to 0,
        "Earth" to 1,
        "Mars" to 2,
        "Jupiter" to 79,
        "Saturn" to 82,
        "Uranus" to 27,
        "Neptune" to 14
    )

    //Print the size of the map
    println(solarSystem.size)

    //Add a new item(key-value pair) in the map.
    solarSystem["Pluto"] = 5
    println(solarSystem.size)

    //Get the value of a specific key
    println(solarSystem.get("Pluto"))
    println(solarSystem["Earth"])

    //Try to access an element that's not in the map
    println(solarSystem["Theia"])

    //Update or edit an element in the map
    solarSystem["Jupiter"] = 100

    for (planet in solarSystem){
        println(planet)
    }
}