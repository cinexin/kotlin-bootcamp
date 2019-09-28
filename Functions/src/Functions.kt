import kotlin.random.Random

fun randomDay(): String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday")
    return week[Random.nextInt(week.size)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Tuesday" -> "pellets"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "pellets"
    }
}

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 50): Boolean {
    return isTooHot(temperature) ||
            isDirty(dirty) ||
            isSunday(day)
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Should change water: ${shouldChangeWater(day)}")
    println ("Today is $day and the fish eat $food")
}

fun swim(speed: String = "fast") {
    println("swimming $speed")
}


fun main(args: Array<String>) {
    println("Hello, world!")

    val isUnit = println("This is an expression")
    println(isUnit)

    val temperature = 10
    val isHot = if (temperature > 50) true else false
    val temperatureMsg = "The water temperature is ${if (temperature > 50) "too warm" else "OK"}"
    println("Is it hot?: $isHot")
    println("Temperature message: $temperatureMsg")

    feedTheFish()
    swim()
    swim(speed = "slow")
    swim(speed = "turtle-like")
}
