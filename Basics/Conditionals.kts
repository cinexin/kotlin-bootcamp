val numberOfFish = -1

if (numberOfFish == 0) {
    println("Empty tank")
} else if (numberOfFish < 40) {
    println("Got fish!")
} else {
    println("That's a lot of fish!")
}

when(numberOfFish) {
    0 -> println("Empty tank")
    in 1..39 -> println ("Got fish!!")
    else -> println ("That's a lot of fish")
}