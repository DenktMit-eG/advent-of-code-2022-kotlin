package joshua

class Day3 : Day {

	fun getCompartments(rucksack: String): Array<String> {
		return arrayOf(rucksack.substring(0, rucksack.length / 2), rucksack.substring(rucksack.length / 2))
	}

	fun getPriority(item: Char): Int {
		return "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(item) + 1
	}

	fun getCommonItemType(rucksack: String): Char {
		val compartments = getCompartments(rucksack)
		val intersect = compartments[0].toCharArray().intersect(compartments[1].toCharArray().asIterable().toSet())
		return intersect.first()
	}

	fun getTotalPriority(rucksacks: String): Int {
		var totalPriority = 0

		for (rucksack: String in rucksacks.split("\n")) {
			totalPriority += getPriority(getCommonItemType(rucksack))
		}

		return totalPriority
	}

	override fun getResult(input: String): String {
		return getTotalPriority(input).toString()
	}

	fun getCommonItemTypeForGroup(rucksacks: List<String>): Char {
		return rucksacks[0].toCharArray()
			.intersect(rucksacks[1].toCharArray().asIterable().toSet())
			.intersect(rucksacks[2].toCharArray().asIterable().toSet()).first()
	}

	fun getGroups(input: String): List<List<String>> {
		return input.split("\n").chunked(3)
	}

	fun getTotalItemPriorityForGroups(input: String): Int {
		var totalPriority = 0
		val groups = getGroups(input)

		for(group: List<String> in groups) {
			totalPriority += getPriority(getCommonItemTypeForGroup(group))
		}

		return totalPriority
	}

	override fun getSecondResult(input: String): String {
		return getTotalItemPriorityForGroups(input).toString()
	}

	override val dayNumber: Int = 3
}