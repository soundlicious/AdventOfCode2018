package aoc

import aoc.days.*

fun main(){
    println(calculateFrequency(getLines("/Day1")))
    println(firstFrequencyReachedTwice(getLines("/Day1")))
    println(listChecksum(getLines("/Day2")))
    println(commonLetters(getLines("/Day2")))

    val day3 = Day3(getLines("/Day3"))
    println(day3.overlapFabric())
    println(day3.nonOverlapingClaim())
}

fun getLines(fileName: String) : List<String> = object {}.javaClass.getResource((fileName)).readText().lines()