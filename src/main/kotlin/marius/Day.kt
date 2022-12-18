package marius

import java.nio.file.Path

interface Day {
    val dayNumber: Int
    fun getResult(inputPath: Path): String
    fun getSecondResult(inputPath: Path): String
}