package example.myapp.decor

data class Decoration2(
        val rocks: String,
        val wood: String,
        val diver: String
)

fun makeBatchDecorations() {
    val decorations = Decoration2("crystal", "wood", "diver")
    val (rocks, wood, diver) = decorations
    println("Rocks: $rocks")
    println("Wood: $wood")
    println("Diver: $diver")
}