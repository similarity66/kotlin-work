import kotlin.io.path.*

fun main(args: Array<String>) {

    val path = Path(args[0])
    if (!path.exists()) {
        println("File not found")
        return
    }

    var longestLineNumber = 0
    var longestLength = 0
    var lineNumber = 0

    path.useLines { 
        for (line in it) {
            lineNumber = lineNumber + 1
            if (line.length > longestLength) {
                longestLength = line.length
                longestLineNumber = lineNumber
            }
        }
    }

    println("Line $longestLineNumber is the longest (length = $longestLength)")

}