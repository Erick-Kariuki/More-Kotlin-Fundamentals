package High_order_Functions

fun main(args: Array<String>) {
    val alphabeticalMenu = cookies.sortedBy {
        it.name
    }

    println("Alphabetical Menu:")
    alphabeticalMenu.forEach {
        println("   . ${it.name}")
    }
}