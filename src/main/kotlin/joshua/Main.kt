package joshua

fun main() {

    val days = listOf(
        Day1(),
        Day2(),
        Day3(),
        Day4(),
        //Day5(),
    )

    days.forEach { day ->
        val input = day.defaultInput()
        println("Day ${day.dayNumber}")
        println("result 01: ${day.getResult(input)}")
        println("result 02: ${day.getSecondResult(input)}")
        println()
    }

}