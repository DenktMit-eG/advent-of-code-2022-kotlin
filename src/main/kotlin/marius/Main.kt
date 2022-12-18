package marius

import marius.DataLoader.Companion.DEFAULT_DATA_LOADER

fun main() {

    val days = listOf(
        Day01(),
    )

    days.forEach { day ->
        val input = DEFAULT_DATA_LOADER.dataPath(day)
        println("Day ${day.dayNumber}")
        println("result 01: ${day.getResult(input)}")
        println("result 02: ${day.getSecondResult(input)}")
        println()
    }

}