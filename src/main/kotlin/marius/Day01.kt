package marius

import java.nio.file.Path

class Day01: Day {

    override val dayNumber: Int = 1

    override fun getResult(inputPath: Path): String = inputPath.processData(::firstTask)

    override fun getSecondResult(inputPath: Path): String = inputPath.processData(::secondTask)

    private fun firstTask(lines: Sequence<String>) = getCaloriesPerElf(lines)
        .max()

    private fun secondTask(lines: Sequence<String>) = getCaloriesPerElf(lines)
        .sortedDescending()
        .take(3)
        .sum()

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