package example.myapp

/**
 * Sealed classes cannot be subclassed outside the file they're declared
 */
sealed class Seal {
    object SeaLion : Seal()
    object Walrus : Seal()

    fun matchSeal(seal: Seal): String {
        return when (seal) {
            is Walrus -> "walrus"
            is SeaLion -> "sea lion"
        }
    }
}