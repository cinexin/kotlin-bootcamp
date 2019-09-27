var marbles: Int? = null

var fishFoodTreats: Int? = 6

fishFoodTreats = fishFoodTreats?.dec()

println ("Fish food treats: $fishFoodTreats")

fishFoodTreats = null
fishFoodTreats = fishFoodTreats?.dec() ?: 0

println ("Fish food treats: $fishFoodTreats")