package joshua

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day4Test {
    private val day = Day4()
    private val testInput = """
        2-4,6-8
        2-3,4-5
        5-7,7-9
        2-8,3-7
        6-6,4-6
        2-6,4-8
    """.trimIndent()

    @Test
    fun testDoRangesFullyOverlap() {
        assertEquals(true, day.doRangesFullyOverlap(3..4 to 2..9))
        assertEquals(true, day.doRangesFullyOverlap(5..17 to 8..13))
        assertEquals(true, day.doRangesFullyOverlap(6..6 to 4..6))
        assertEquals(false, day.doRangesFullyOverlap(3..12 to 2..9))
    }

    @Test
    fun testDoRangesOverlap() {
        assertEquals(true, day.doRangesOverlap(3..4 to 2..9))
        assertEquals(true, day.doRangesOverlap(3..12 to 2..9))
        assertEquals(false, day.doRangesOverlap(3..6 to 7..9))
    }

    @Test
    fun testGetRangesFromString() {
        assertEquals(3..4 to 2..9, day.getRangesFromString("3-4,2-9"))
        assertEquals(39..68 to 55..70, day.getRangesFromString("39-68,55-70"))
    }

    @Test
    fun testGetAmountOfFullOverlaps() {
        assertEquals(2, day.getAmountOfFullOverlaps(testInput))
    }

    @Test
    fun testGetAmountOfOverlaps() {
        assertEquals(4, day.getAmountOfOverlaps(testInput))
    }

    @Test
    fun getResult() {
        assertEquals("2", day.getResult(testInput))
    }

    @Test
    fun getSecondResult() {
        assertEquals("4", day.getSecondResult(testInput))
    }
}