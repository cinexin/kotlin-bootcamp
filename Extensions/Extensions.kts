fun String.hasSpaces(): Boolean = this.contains(' ')

println("Do I have spaces?: ${"Do I have spaces?".hasSpaces()}")
println("DoIHaveSpaces?: ${"DoIHaveSpaces?".hasSpaces()}")

open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

val AquariumPlant.isGreen: Boolean
    get() = color == "green"

println ("Aquarium plant is green? ${AquariumPlant("green", 10).isGreen}")
println ("Aquarium plant is green? ${AquariumPlant("pink", 10).isGreen}")

fun AquariumPlant?.pull() {
    this?.apply {
        println("removing ${this.javaClass.canonicalName}")
    }
}

val nullPlant: AquariumPlant? = null
nullPlant.pull()

val bluePlant: AquariumPlant = AquariumPlant("blue", 10)
bluePlant.pull()