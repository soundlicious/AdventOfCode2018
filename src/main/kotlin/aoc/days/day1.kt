package aoc.days

fun calculateFrequency(changes: List<String>): Int {
    return changes.fold(0) { total, next ->
            total + next.toInt()
    }
}

fun firstFrequencyReachedTwice(changes: List<String>) : Int {
    var total = 0
    val frequencies : MutableSet<Int> = mutableSetOf()
    frequencies.add(0)

    sequence {
        while (true)
            yieldAll(changes)
    }.forEach {
        total += it.toInt()
        if(!frequencies.add(total)) {
            return total
        }
    }
    return total
}