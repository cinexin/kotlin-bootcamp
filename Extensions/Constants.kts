object Constants {
    const val CONSTANT2 = "object constant"
}
val foo = Constants.CONSTANT2
println(foo)

class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}

println(MyClass.CONSTANT3)