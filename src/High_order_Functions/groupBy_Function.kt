package High_order_Functions

//The groupBy() function can be used to turn a list into a map, based on a function.
// Each unique return value of the function becomes a key in the resulting map.
// The values for each key are all the items in the collection that produced that
// unique return value.

fun main() {
    val groupedMenu = cookies.groupBy {
        it.softBaked
    }

    val softBakedMenu = groupedMenu[true] ?: emptyList() //listOf()
    val crunchyMenu = groupedMenu[false] ?: emptyList()  //listOf()

    println("Soft Cookies:")
    softBakedMenu.forEach {
        println("${it.name} : $${it.price}")
    }
    println()

    println("Crunchy Cookies:")
    crunchyMenu.forEach {
        println("${it.name} : $${it.price}")
    }
}