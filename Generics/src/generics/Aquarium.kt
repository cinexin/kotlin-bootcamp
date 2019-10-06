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


class Aquarium<T: WaterSupply>(val waterSupply: T)

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