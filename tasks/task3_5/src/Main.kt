// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    val path = Path("test.txt")
    path.writeText("sim")
    path.appendText("ryosu")
    val contents = path.readText()
    println("contents = $contents")
}
