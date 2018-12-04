package aoc.days

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class Day3Test {

    private val day3 = Day3(listOf("#1 @ 1,3: 4x4","#2 @ 3,1: 4x4","#3 @ 5,5: 2x2"))
    @org.junit.jupiter.api.AfterEach
    fun tearDown() {
    }

    @Test
    fun calculate_overlap_clothing(){
        assertEquals(4, day3.overlapFabric())
    }

    @Test
    fun find_non_overlap_clothing(){
        assertEquals(3, day3.nonOverlapingClaim())
    }
}