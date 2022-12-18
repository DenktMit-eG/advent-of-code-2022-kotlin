package joshua

class Day1 : Day {


    fun getAllElves(input: String): List<Long> {
        var calories: MutableList<Long> = mutableListOf()

        var currentElf = 0
        for(calory: String in input.split("\n")) {

            if(calory.trim().isNullOrEmpty()) {
                currentElf++
                continue
            }

            if(calories.count() <= currentElf) {
                calories.add(0)
            }
            calories[currentElf] += calory.toLong()
        }

        return calories
    }

    fun getRichestElf(input: String): Long {
        return getAllElves(input).sortedDescending()[0]
    }

    override val dayNumber: Int = 1

    override fun getResult(input: String): String {
        return getRichestElf(input).toString()
    }

    override fun getSecondResult(input: String): String {
        return getTopThreeElves(input).toString()
    }

    fun getTopThreeElves(input: String): Long {
        val elves = getAllElves(input).sortedDescending()

        return elves[0] + elves[1] + elves[2]
    }

}