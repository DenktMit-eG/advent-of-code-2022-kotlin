package joshua

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day2Test {
    private val day = Day2()
    private val testInput = """
        A Y
        B X
        C Z
    """.trimIndent()

    @Test
    fun testGetScoreForRound() {
        assertEquals(6, day.getScoreForRound("C Z"))
    }
    @Test
    fun testGetScoreForShape() {
        assertEquals(2, day.getScoreForShape("A Y"))
    }
    @Test
    fun testGetScoreForOutcome() {
        assertEquals(3, day.getScoreForOutcome("A X"))
    }

    @Test
    fun testGetTotalScore() {
        assertEquals(15, day.getTotalScore(testInput))
    }

    @Test
    fun testChooseShape() {
        assertEquals("X", day.chooseShape("A Y"))
        assertEquals("X", day.chooseShape("B X"))
        assertEquals("X", day.chooseShape("C Z"))
    }
    @Test
    fun testGetScoreForSecondRound() {
        assertEquals(4, day.getScoreForSecondRound("A Y"))
        assertEquals(1, day.getScoreForSecondRound("B X"))
        assertEquals(7, day.getScoreForSecondRound("C Z"))
    }

    @Test
    fun testGetSecondTotalScore() {
        assertEquals(12, day.getSecondTotalScore(testInput))
    }

    @Test
    fun getResult() {
        assertEquals("15", day.getResult(testInput))
    }

    @Test
    fun getSecondResult() {
        assertEquals("12", day.getSecondResult(testInput))
    }
}