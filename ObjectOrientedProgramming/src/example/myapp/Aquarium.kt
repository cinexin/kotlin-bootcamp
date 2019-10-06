package example.myapp

open class Aquarium(var width: Int = 20,
                    open var height: Int = 40,
                    var length: Int = 100) {
    fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        // 1 l = 1000 cm^3
        println("Volume: $volume l Water: $water l (${water/volume*100.0}% full)")
        println ("/Aquariumid:  ${this.toString()}")
        println ("------")
    }
    open val shape = "rectangle"

    init {
        println ("------")
        println ("Aquariumid:  ${this.toString()}")
        println("Volume: ${width * length * height / 1000} l")
    }

    constructor(numberOfFish: Int): this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        height = (tank / (length * width)).toInt()
    }

    open var volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 l
        set(value) {
            height = (value * 1000) / (width * length)
        }

    open var water: Double = 0.0
        get() = volume * 0.9
}

/**
 * Rounded cylinder tank instead of a rectangular tank
 */
class TowerTank (override var height: Int, diameter: Int)
    : Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        // ellipse area = π * r1 * r2
        get() = (width/2 * length/2 * height / 1000 * Math.PI).toInt()
        set(value) {
            height = ((value * 1000 / Math.PI) / (width/2 * length/2)).toInt()
        }

    override var water = volume * 0.8

    override val shape = "cylinder"
}