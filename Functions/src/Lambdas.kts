val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }
println("After filtering water the dirty level is: ${waterFilter(10)}")

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

var dirtyLevel = updateDirty(30, waterFilter)
println ("Now the dirty level is: $dirtyLevel")

fun increaseDirty( start: Int ) = start + 1

// you can pass functions too...
println(updateDirty(15, ::increaseDirty))

dirtyLevel = 19
dirtyLevel = updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
println(dirtyLevel)