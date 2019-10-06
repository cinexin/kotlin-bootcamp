package example.myapp

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

abstract class AquariumFish {
    abstract val color: Color
}

class Shark:FishColor, FishAction {
    override fun eat() {
        println("hunt and eat fish")
    }

    override val color = Color.BLUE
}

/**
 * This is what "delegation" looks like in Kotlin
 */
class Plecostomus(fishColor: FishColor = GoldColor)
    : FishColor by fishColor,
        FishAction by PrintingFishAction("algae"){
}

/**
 * Singletons in Kotlin...
 */
object GoldColor : FishColor {
    override val color = Color.RED
}

interface FishColor {
    val color: Color
}

interface FishAction {
    fun eat()
}

class PrintingFishAction(private val food: String): FishAction {
    override fun eat() {
        println("Eat $food")
    }

}