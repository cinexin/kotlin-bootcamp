package example.myapp

import example.myapp.decor.makeBatchDecorations
import example.myapp.decor.makeDecorations

fun buildAquariums(): List<Aquarium> {
    val aquarium1 = Aquarium()
    aquarium1.printSize()
    // default height and length
    val aquarium2 = Aquarium(width = 25)
    aquarium2.printSize()
    // default width
    val aquarium3 = Aquarium(height = 35, length = 110)
    aquarium3.printSize()
    // everything custom
    val aquarium4 = Aquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()

    val aquarium5 = Aquarium(numberOfFish = 1000)
    aquarium5.printSize()
    aquarium5.volume = 70
    aquarium5.printSize()

    val aquarium6 = TowerTank(diameter = 25, height = 40)
    aquarium6.printSize()

    return listOf(aquarium1, aquarium2, aquarium3, aquarium4, aquarium5)
}

fun makeFishes() {
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}


fun main() {
    buildAquariums()
    makeFishes()
    makeDecorations()
    makeBatchDecorations()
}