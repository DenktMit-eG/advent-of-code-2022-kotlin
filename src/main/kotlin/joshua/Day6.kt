package days

import joshua.Day
import java.lang.Exception

class Day6 : Day {
    override val dayNumber: Int = 6

    fun getIndexOfFinishedSequence(sequence: String): Int {
        for(index in 3 until sequence.length) {

            if("${sequence[index]}${sequence[index - 1]}${sequence[index - 2]}${sequence[index - 3]}".areAllCharactersUnique()) {
                return index + 1
            }
        }
        throw Exception("No Sequence found")
    }

    override fun getResult(input: String): String {
        return getIndexOfFinishedSequence(input).toString()
    }

    override fun getSecondResult(input: String): String {
        TODO("Not yet implemented")
    }
}