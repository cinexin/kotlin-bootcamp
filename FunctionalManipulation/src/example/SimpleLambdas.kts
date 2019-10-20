val waterFilter = { dirty: Int -> dirty / 2 }
println ("Water filter: ${waterFilter(30)}")


data class Fish(val name: String)
val myFish = listOf(Fish("Flipper"), Fish("Moby Dick"), Fish("Dory"))

println("Fishes which name contain the 'i' letter: ${myFish.filter { it.name.contains("i")}}")
println("Fishes which name contain the 'i' letter (prettier output): ${myFish.filter { it.name.contains("i")}.joinToString(", ") { it.name }}")