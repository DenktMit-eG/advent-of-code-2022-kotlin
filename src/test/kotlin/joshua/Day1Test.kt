package joshua

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class Day1Test {
    private val day = Day1()
    private val testInput = """
        1000
        2000
        3000

        4000

        5000
        6000

        7000
        8000
        9000

        10000
    """.trimIndent()

    @Test
    fun testGetAllElves() {
        assertContentEquals(listOf(6000, 4000, 11000, 24000, 10000), day.getAllElves(testInput))
    }

    @Test
    fun testGetRichestElf() {
        Assertions.assertEquals(24000, day.getRichestElf(testInput))
    }

    @Test
    fun testGetTopThreeElves() {
        Assertions.assertEquals(45000, day.getTopThreeElves(testInput))
    }

    @Test
    fun getResult() {
        Assertions.assertEquals("24000", day.getResult(testInput))
    }

    @Test
    fun getSecondResult() {
        Assertions.assertEquals("45000", day.getSecondResult(testInput))
    }
}