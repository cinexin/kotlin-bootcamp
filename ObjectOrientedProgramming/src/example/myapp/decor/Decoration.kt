package example.myapp.decor

data class Decoration(
        val rocks: String
)

fun makeDecorations() {
    val rocksDecoration = Decoration("granite")
    println(rocksDecoration)

    val slateDecoration1 = Decoration("slate")
    println(slateDecoration1)

    val slateDecoration2 = Decoration("slate")
    println(slateDecoration2)

    println ("Rocks decoration is the same as Slate decoration?: ${rocksDecoration.equals(slateDecoration1)}")
    println ("Slate decoration 1 is the same as Slate decoration 2?: ${slateDecoration1.equals(slateDecoration2)}")
}

