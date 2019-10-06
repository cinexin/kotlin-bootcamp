val equipment = "fish net" to "catching fish"
println("${equipment.first} used for ${equipment.second}")
val (tool, use) = equipment
println("$tool is used for $use")

val numbers = Triple(6, 9, 42)
println(numbers.toString())
println(numbers.toList())