package generics

open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class FishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(true) {
    fun filter() {
        needsProcessing = false
    }
}


class Aquarium<out T: WaterSupply>(val waterSupply: T) {
    fun addWater() {
        /**
         * check is a Kotlin method that throws an IllegalStateException when condition is false
         *
         * ie: "check that water supply doesn't need processing"
         */
        check(!waterSupply.needsProcessing) {
            "water supply needs processing first"
        }
        println ("Adding water from $waterSupply")
    }

    fun addWater(cleaner: Cleaner<T>) {
        if (waterSupply.needsProcessing) {
            cleaner.clean(waterSupply)
        }
        println("water added")
    }

    inline fun <reified R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R
}


fun genericsExample() {
    val aquarium = Aquarium(TapWater())
    println("Aquarium water supply: ${aquarium.waterSupply.javaClass.canonicalName}")
    println("Aquarium needs processing?: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("Aquarium still needs processing?: ${aquarium.waterSupply.needsProcessing}")
}

fun genericsExample2() {
    val aquarium2 = Aquarium(FishStoreWater())
    println(aquarium2.waterSupply.javaClass)
}

fun genericsExample3() {
    val aquarium3 = Aquarium(LakeWater())
    println(aquarium3.waterSupply.javaClass)

}

fun genericsExample4() {
    val aquarium4 = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()
    aquarium4.addWater()
}

fun addItemTo(aquarium: Aquarium<WaterSupply>) = println("item added")

fun genericsExample5() {
    val aquarium = Aquarium(TapWater())
    addItemTo(aquarium)
}


interface Cleaner<in T: WaterSupply> {
    fun clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater> {
    override fun clean(waterSupply: TapWater) = waterSupply.addChemicalCleaners()
}

fun genericsExample6() {
    val cleaner = TapWaterCleaner()
    val aquarium = Aquarium(TapWater())
    aquarium.addWater(cleaner)
}

fun <T:WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
    println ("Aquarium water is clean?: ${!aquarium.waterSupply.needsProcessing}")
}

fun genericsExample7() {
    val aquarium = Aquarium(TapWater())
    isWaterClean(aquarium)
}

inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T

fun genericsExample8() {
    val aquarium = Aquarium(TapWater())
    println("aquarium.waterSupply is of type TapWater?: " + aquarium.waterSupply.isOfType<TapWater>())
}

inline fun <reified R: WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

fun genericsExample9() {
    val aquarium = Aquarium(TapWater())
    println("aquarium.hasWaterSupplyOfType<TapWater>? " + aquarium.hasWaterSupplyOfType<TapWater>())
}