package joshua

class Day4 : Day {

    fun doRangesFullyOverlap(ranges: Pair<IntRange, IntRange>): Boolean {
        return ranges.first.first <= ranges.second.first && ranges.first.last >= ranges.second.last
                ||
                ranges.second.first <= ranges.first.first && ranges.second.last >= ranges.first.last
    }

    fun doRangesOverlap(ranges: Pair<IntRange, IntRange>): Boolean {
        return ranges.first.intersect(ranges.second).isNotEmpty()
    }

    fun getRangesFromString(input: String): Pair<IntRange, IntRange> {
        val rangesAsStrings = input.split(",")
        val firstRange = rangesAsStrings[0].split("-")
        val secondRange = rangesAsStrings[1].split("-")

        return firstRange[0].toInt()..firstRange[1].toInt() to secondRange[0].toInt()..secondRange[1].toInt()
    }

    fun getAmountOfFullOverlaps(input: String): Int {
        var totalAmount = 0

        for(line in input.split("\n")) {
            if(doRangesFullyOverlap(getRangesFromString(line))) {
                totalAmount++
            }
        }

        return totalAmount
    }

    fun getAmountOfOverlaps(input: String): Int {
        var totalAmount = 0

        for(line in input.split("\n")) {
            if(doRangesOverlap(getRangesFromString(line))) {
                totalAmount++
            }
        }

        return totalAmount
    }

    override fun getResult(input: String): String {
        return getAmountOfFullOverlaps(input).toString()
    }

    override fun getSecondResult(input: String): String {
        return getAmountOfOverlaps(input).toString()
    }

    override val dayNumber: Int = 4
}