package aoc.days

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class Day2Test {

    @org.junit.jupiter.api.AfterEach
    fun tearDown() {
    }

    @Test
    fun calculate_correct_list_checksum() {
        assertEquals(12, listChecksum(listOf("abcdef", "bababc", "abbcde", "abcccd", " aabcdd", "abcdee", "ababab")))
    }

    @Test
    fun return_correct_common_letter() {
        assertEquals("fgij", commonLetters(listOf("abcde", "fghij", "klmno", "pqrst", "fguij", "axcye", "wvxyz")))
    }
}