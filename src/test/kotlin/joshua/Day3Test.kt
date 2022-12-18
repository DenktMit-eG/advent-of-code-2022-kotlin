package joshua

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class Day3Test {
	private val day = Day3()
	private val testInput = """
		vJrwpWtwJgWrhcsFMMfFFhFp
		jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL
		PmmdzqPrVvPwwTWBwg
		wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn
		ttgJtRGJQctTZtZT
		CrZsJsPPZsGzwwsLwLmpwMDw
	""".trimIndent()

	@Test
	fun testGetCompartments() {
		assertContentEquals(arrayOf("vJrwpWtwJgWr", "hcsFMMfFFhFp"), day.getCompartments("vJrwpWtwJgWrhcsFMMfFFhFp"))
		assertContentEquals(
			arrayOf("jqHRNqRjqzjGDLGL", "rsFMfFZSrLrFZsSL"),
			day.getCompartments("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL")
		)
	}

	@Test
	fun testGetPriority() {
		assertEquals(1, day.getPriority('a'))
		assertEquals(52, day.getPriority('Z'))
		assertEquals(16, day.getPriority('p'))
		assertEquals(38, day.getPriority('L'))
	}

	@Test
	fun testGetCommonItemType() {
		assertEquals('p', day.getCommonItemType("vJrwpWtwJgWrhcsFMMfFFhFp"))
		assertEquals('L', day.getCommonItemType("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL"))
		assertEquals('s', day.getCommonItemType("CrZsJsPPZsGzwwsLwLmpwMDw"))
	}

	@Test
	fun testGetTotalPriority() {
		assertEquals(157, day.getTotalPriority(testInput))
	}


	@Test
	fun testGetCommonItemTypeForGroup() {
		assertEquals(
			'r', day.getCommonItemTypeForGroup(
				listOf(
					"vJrwpWtwJgWrhcsFMMfFFhFp",
					"jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
					"PmmdzqPrVvPwwTWBwg"
				)
			)
		)
	}

	@Test
	fun getGroups() {
		assertContentEquals(
			listOf(
				listOf(
					"vJrwpWtwJgWrhcsFMMfFFhFp",
					"jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL",
					"PmmdzqPrVvPwwTWBwg"
				),
				listOf(
					"wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn",
					"ttgJtRGJQctTZtZT",
					"CrZsJsPPZsGzwwsLwLmpwMDw"
				)
			), day.getGroups(testInput)
		)
	}

	@Test
	fun getTotalItemPriorityForGroups() {
		assertEquals(70, day.getTotalItemPriorityForGroups(testInput))
	}

	@Test
	fun getResult() {
		assertEquals("157", day.getResult(testInput))
	}

	@Test
	fun getSecondResult() {
		assertEquals("70", day.getSecondResult(testInput))
	}

}