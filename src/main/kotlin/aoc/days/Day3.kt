package aoc.days

class Day3(plans: List<String>){
    private val expectedPlanSize: MutableMap<Int, Int> = mutableMapOf()
    private val coordsCounter: MutableMap<Pair<Int, Int>, MutableList<Int>> = mutableMapOf()

    init {
        plans.forEach { plan ->
            val claim = getClaim(plan)

            val id = claim[0]
            var y = claim[2]
            val width = claim[3]
            val height = claim[4]
            val yMax = y + height
            expectedPlanSize[id] = width * height

            while (y < yMax) {
                var x = claim[1]
                val xMax = x + width
                while (x < xMax) {
                    val coord = Pair(x, y)
                    val list = coordsCounter[coord] ?: mutableListOf()
                    list.add(id)
                    coordsCounter[coord] = list
                    x++
                }
                y++
            }
        }
    }

    private fun getClaim(plan: String): List<Int> {
        return plan.split("#", "@", ",", ":", "x")
            .filter { it.isNotEmpty() }
            .map { it.trim().toInt() }
    }

    fun overlapFabric(): Int {
        return coordsCounter.count { it.value.size > 1 }
    }

    fun nonOverlapingClaim(): Int {
        return coordsCounter
            .filter { it.value.size == 1 }
            .map { it.value.first() }
            .groupingBy { it }
            .eachCount()
            .filter { it.value == expectedPlanSize[it.key] }
            .map { it.key }
            .first()
    }
}