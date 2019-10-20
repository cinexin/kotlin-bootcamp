package example

data class Fish(var name: String)

fun fishExamples() {
    val fish = Fish("splashy")  // all lowercase

    myWith(fish.name) {
        println (this.capitalize())
    }

}


/**
 * Arguments:
 * [name] object we operate on
 * [block] extension function of an string (receiver object)
 *
 * Since method doesn't return anything, we return the convention [Unit]
 */
inline fun myWith(name: String, block: String.() -> Unit) {
    name.block()
}

fun runExample() {
    val runnable = Runnable { println("I'm a Runnable") }
    JavaRun.runNow{
        println ("I'm a runnable")
    }
}

fun main () {
    fishExamples()
    runExample()
}