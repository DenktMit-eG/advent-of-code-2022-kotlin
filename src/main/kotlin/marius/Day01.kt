package marius

import java.nio.file.Path
import kotlin.io.path.useLines

class Day01: Day {

    override val dayNumber: Int = 1

    override fun getResult(inputPath: Path): String {
        return inputPath.useLines { lines: Sequence<String> ->
            getCaloriesPerElf(lines).max()
        }.toString()
    }

    override fun getSecondResult(inputPath: Path): String {
        return inputPath.useLines { lines: Sequence<String> ->
            getCaloriesPerElf(lines)
                .sortedDescending()
                .take(3)
                .sum()
        }.toString()
    }

    private fun getCaloriesPerElf(lines: Sequence<String>): Sequence<Int> {
        val lineIterator = lines.iterator()
        return generateSequence {
            if (!lineIterator.hasNext()){
                return@generateSequence null
            }
            var calories = 0
            do {
                calories += lineIterator.next().trim().toIntOrNull() ?: break
            } while (lineIterator.hasNext())
            return@generateSequence calories
        }
    }

}