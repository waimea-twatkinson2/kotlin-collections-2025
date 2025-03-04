/**
 * Learning about Kotlin collections, particularly
 * the MutableList type
 */

fun main() {
    println("Kotlin MutableList")
    println()

    // Create our list
    val snacks = mutableListOf<String>()

    // Show it
    println(snacks)

    // Add in some things...
    snacks.add("Chips")
    snacks.add("Twix")
    snacks.add("Beer")
    snacks.add("Nugs")
    snacks.add("Lumps")
    snacks.add("Ham")
    println(snacks)

    // Show specific items
    println(snacks[0])
    //println(snacks[10])  This would be out of bounds!

    // Change a value
    snacks[1] = "Cheese"
    println(snacks)

    // Remove an item
    snacks.removeAt(0)
    println(snacks)

    // Add in new items in specific places
    snacks.add(1, "Bacon")
    println(snacks)

    // Sort the list
    snacks.sort()
    println("Sorted: $snacks")

    // Shuffle the list (randomise it)
    snacks.shuffle()
    println("Shuffled: $snacks")

    // Get a random item from list
    val item = snacks.random()
    println("Random item: $item")

    // Searching for an item
    println("Beer is in list: ${ snacks.contains("Beer") }")
    println("Horse is in list: ${ snacks.contains("Horse") }")

    // Getting index of an item
    println("Beer index: ${ snacks.indexOf("Beer") }")
    println("Horse index: ${ snacks.indexOf("Horse") }")


    // Loop through the list


    // Loop using an index
    for (i in 0 ..< snacks.size) {
        println("$i: ${ snacks[i] }")
    }

    // Loop getting index and values
    for ((i, snack) in snacks.withIndex()) {
        println("$i: $snack")
    }

}

