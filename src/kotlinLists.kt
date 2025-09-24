
//A list is an ordered, resizable collection, typically implemented as a resizable array.
// When the array is filled to capacity, and you try to insert a new element,
// the array is copied to a new bigger array.

fun main() {

    val solarSystem = mutableListOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

    //Updating or editing an item in the list
    solarSystem[3] = "Future Moon"

    //Accessing items in a list
    println(solarSystem[2])
    println(solarSystem.get(3))

    //Checking the index of an item in the list
    println(solarSystem.indexOf("Earth"))

    //Removing or deleting the item in a list
    solarSystem.removeAt(7)  //solarSystem.remove(solarSystem[7]) //solarSystem.remove("Pluto")


    //Adding a new item in a list
    solarSystem.add("Pluto")
    solarSystem.add("Pluto") // A list can contain duplicate items
    solarSystem.add(3,"Theia")

    //Printing all items in the list
    for (planet in solarSystem){
        println(planet)
    }
}