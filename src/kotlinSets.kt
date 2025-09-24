
//A set is a collection that does not have a specific order and
// does not contain duplicate values.

fun main() {

    val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    //Print the size of the set
    println(solarSystem.size)

    //Add an item in the set
    solarSystem.add("Pluto")
    println(solarSystem.size)

    //Check if an item exists in a set
    println(solarSystem.contains("Pluto"))
    println(("Theia" in solarSystem))

    //A set cannot have duplicate items.
    solarSystem.add("Pluto")
    println(solarSystem.size)

    for (planet in solarSystem){
        println(planet)
    }

}