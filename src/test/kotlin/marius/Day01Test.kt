package marius

import marius.TestHelper.TEST_DATA_LOADER
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class Day01Test {

    private val day = Day01()

    @Test
    fun getDayNumber() {
        assertEquals(1, day.dayNumber)
    }

    @Test
    fun getResult() {
        assertEquals("24000", day.getResult(TEST_DATA_LOADER.dataPath(day)))
    }

    @Test
    fun getSecondResult() {
        assertEquals("45000", day.getSecondResult(TEST_DATA_LOADER.dataPath(day)))
    }
}