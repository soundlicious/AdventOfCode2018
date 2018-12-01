package aoc

import aoc.days.calculateFrequency
import aoc.days.firstFrequencyReachedTwice

fun main(){
    println(calculateFrequency(getLines("/Day1-1")))
    println(firstFrequencyReachedTwice(getLines("/Day1-1")))
}

fun getLines(fileName: String) : List<String> = object {}.javaClass.getResource((fileName)).readText().lines()