// Task 7.7.1: statistics functions
fun Int.isOdd() = this % 2 != 0
fun findMedian(filename: String) {
    if {readData(filename).size.isOdd()} {
        val sorted: List<Float> = readData(filename).sorted()
        return sorted[sorted.size / 2]
    } else {
        val sorted: List<Float> = readData(filename).sorted()
        val mid = sorted.size / 2
        return (sorted[mid - 1] + sorted[mid]) / 2
    }
}