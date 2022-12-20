package joshua

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class Day5Test {
    private val day = Day5()
    private val testInput = """
            [D]    
        [N] [C]    
        [Z] [M] [P]
         1   2   3 
        
        move 1 from 2 to 1
        move 3 from 1 to 3
        move 2 from 2 to 1
        move 1 from 1 to 2
    """.trimIndent()

    @Test
    fun testGetResultOfRearrangement() {
        assertEquals("CMZ", day.getResultOfRearrangement(testInput))
    }

    @Test
    fun testDoInstructions() {
        assertEquals(
            mapOf(1 to listOf('C'), 2 to listOf('M'), 3 to listOf('Z', 'N', 'D', 'P')),
            day.doInstructions(
                mutableMapOf(1 to mutableListOf('N', 'Z'), 2 to mutableListOf('D', 'C', 'M'), 3 to mutableListOf('P')),
                listOf(listOf(1, 2, 1), listOf(3, 1, 3), listOf(2, 2, 1), listOf(1, 1, 2))
            )
        )
    }

    @Test
    fun testDoInstructionsForNewCrane() {
        assertEquals(
            mapOf(1 to listOf('M'), 2 to listOf('C'), 3 to listOf('D', 'N', 'Z', 'P')),
            dayFive.doInstructionsForNewCrane(
                mutableMapOf(1 to mutableListOf('N', 'Z'), 2 to mutableListOf('D', 'C', 'M'), 3 to mutableListOf('P')),
                listOf(listOf(1, 2, 1), listOf(3, 1, 3), listOf(2, 2, 1), listOf(1, 1, 2))
            )
        )
    }

    @Test
    fun testMapInstructions() {
        assertContentEquals(
            listOf(listOf(1, 2, 1), listOf(3, 1, 3), listOf(2, 2, 1), listOf(1, 1, 2)),
            day.mapInstructions("move 1 from 2 to 1\n" +
                    "move 3 from 1 to 3\n" +
                    "move 2 from 2 to 1\n" +
                    "move 1 from 1 to 2")
        )
    }

    @Test
    fun testMapStacks() {
        assertEquals(
            mapOf(1 to listOf('N', 'Z'), 2 to listOf('D', 'C', 'M'), 3 to listOf('P')), day.mapStacks(
                "    [D]    \n" +
                        "[N] [C]    \n" +
                        "[Z] [M] [P]\n" +
                        " 1   2   3 "
            )
        )
    }

    @Test
    fun getResult() {
        assertEquals("CMZ", day.getResult(testInput))
    }

    @Test
    @Disabled
    fun getSecondResult() {
        assertEquals("", day.getSecondResult(testInput))
    }
}