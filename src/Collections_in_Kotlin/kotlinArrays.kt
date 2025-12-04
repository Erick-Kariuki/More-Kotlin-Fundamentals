package Collections_in_Kotlin
//Arrays store ordered data of the same type, and have a fixed size.

fun main(args: Array<String>) {

    val rockPlanets = arrayOf<String>("Mercury", "Venus", "Mars", "Earth")

    val gasPlanets = arrayOf("Jupiter", "Saturn", "Uranus", "Neptune")

    val solarSystem = rockPlanets + gasPlanets

    solarSystem[3] = "Little Earth"
//    solarSystem[8] = "Pluto"
    val newSolarSystem = arrayOf("Mercury", "Venus", "Mars", "Earth",
        "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto")
    solarSystem.shuffle()

    println(newSolarSystem.size)
    println(solarSystem[0])
    println(solarSystem[1])
    println(solarSystem[2])
    println(solarSystem[3])
    println(solarSystem[4])
    println(solarSystem[5])
    println(solarSystem[6])
    println(solarSystem[7])


}