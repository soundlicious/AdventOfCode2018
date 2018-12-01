package test

import aoc.days.calculateFrequency
import aoc.days.firstFrequencyReachedTwice
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Day1Test {

    @org.junit.jupiter.api.AfterEach
    fun tearDown() {
    }

    @Test
    fun calculate_correct_frequency(){
        assertEquals(3, calculateFrequency(listOf("+1", "+1", "+1")))
        assertEquals(0, calculateFrequency(listOf("+1", "+1", "-2")))
        assertEquals(-6, calculateFrequency(listOf("-1", "-2", "-3")))
    }

    @Test
    fun find_first_frequency_repeated_twice(){
        assertEquals(0, firstFrequencyReachedTwice(listOf("+1", "-1")))
        assertEquals(10, firstFrequencyReachedTwice(listOf("+3", "+3", "+4", "-2", "-4")))
        assertEquals(5, firstFrequencyReachedTwice(listOf("-6", "+3", "+8", "+5", "-6")))
        assertEquals(14, firstFrequencyReachedTwice(listOf("+7", "+7", "-2", "-7", "-4")))
    }
}