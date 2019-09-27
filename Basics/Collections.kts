import java.util.*

val schoolList = listOf("mackerel", "trout", "halibut")
println(schoolList)

for (element in schoolList) {
    print(element + " ")
}
print("\n")

for ((index, element) in schoolList.withIndex()) {
    println("Item at $index is $element\n")
}


val myList = mutableListOf("tuna", "salmon", "shark")
val sharkRemoved = myList.remove("shark")
println ("Was the shark removed? $sharkRemoved")

val schoolArray = arrayOf("shark", "salmon", "minnow")
println(Arrays.toString(schoolArray))

val mix = arrayOf("fish", 2)
println("Mix[0]: ${mix[0]}")
println("Mix[1]: ${mix[1]}")

val numbers = intArrayOf(1,2,3)
println ("Numbers[0]: ${numbers[0]}")
println ("Numbers[1]: ${numbers[1]}")
println ("Numbers[2]: ${numbers[2]}")

val numbers2 = intArrayOf(4, 5, 6)
val foo2 = numbers + numbers2
println ("Foo2[0]: ${foo2[0]}")
println ("Foo2[1]: ${foo2[1]}")
println ("Foo2[2]: ${foo2[2]}")
println ("Foo2[3]: ${foo2[3]}")
println ("Foo2[4]: ${foo2[4]}")
println ("Foo2[5]: ${foo2[5]}")

val oceans = listOf("Atlantic", "Pacific")
val oddList = listOf(numbers, oceans, "salmon")
println(oddList)

val array = Array (5) { it * 2 }
println(Arrays.toString(array))

for (i in 5 downTo 1) print(i)
println()
for (i in 'd'..'g') print (i)

println()

var bubbles = 0
while (bubbles < 50) {
    bubbles++
}
println("$bubbles bubbles in the water\n")

do {
    bubbles--
} while (bubbles > 50)
println("$bubbles bubbles in the water\n")

repeat(2) {
    println("A fish is swimming")
}