package marius

import java.nio.file.Path

class DataLoader(
    private val basePath: Path
) {

    companion object {
        val DEFAULT_DATA_LOADER = DataLoader(
            Path.of("src", "main", "resources", "marius")
        )
    }

    fun dataPath(day: Day): Path {
        val fileName = "day${day.dayNumber.toString().padStart(2, '0')}.txt"
        return basePath.resolve(fileName)
    }

}