package joshua

import java.io.File
import java.nio.file.Files

interface Day {
    val dayNumber: Int
    fun getResult(input: String): String
    fun getSecondResult(input: String): String
    fun defaultInput(): String {
        val fileName = "day${dayNumber.toString().padStart(2, '0')}.txt"
        return Files.readString(File("src/main/resources/joshua/$fileName").toPath())
    }
}