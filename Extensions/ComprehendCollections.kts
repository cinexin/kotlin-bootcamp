val list = listOf(1, 5, 3, 4)
println("Sum of $list is: ${list.sum()}")

val list2 = listOf("a", "bbb", "cc")
println("Sum of lenghts of $list2: ${list2.sumBy { it.length }}")

val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")
println("Cure for red sores is: ${cures["red sores"]}")

println("Cure for bloating: ${cures.getOrDefault("bloating", "sorry, I don't know")}")

println("Cure for inet addiction: ${cures.getOrElse("inet addiction") {"No cure for this"}}")


val inventory = mutableMapOf("fish net" to 1)
inventory.put("tank scrubber", 3)
println(inventory.toString())
inventory.remove("fish net")
println(inventory.toString())