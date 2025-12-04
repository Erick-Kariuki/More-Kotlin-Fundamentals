package High_order_Functions

//The map() function lets you transform a collection into a new collection with the same
// number of elements. For example, map() could transform a List<Cookie> into a List<String>
// only containing the cookie's name, provided you tell the map() function how to create
// a String from each Cookie item.


fun main() {
    val fullMenu = cookies.map {
        "${it.name} : $${it.price}"
    }

    println("Full Menu:")
    fullMenu.forEach {
        println(it)
    }

}