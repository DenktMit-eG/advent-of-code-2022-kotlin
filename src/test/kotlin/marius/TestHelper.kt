package marius

import java.nio.file.Path

object TestHelper {

    internal val TEST_DATA_LOADER = DataLoader(Path.of("src", "test", "resources"))

}