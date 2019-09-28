val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

fun main() {
    val eager = decorations.filter {it[0] == 'p'}
    println ("Eager decorations: $eager")

    // lazy, will wait until asked to evaluate
    val filtered = decorations.asSequence().filter { it[0] == 'p' }
    println("filtered: ${filtered.toList()}")

    val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
        println("access: $it")
        it
    }
    println("filtered: ${ lazyMap2.toList() }")
}