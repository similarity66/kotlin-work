

fun Int.isOdd() = this % 2 != 0

fun findMedian(data: List<Float>): Float {
    if (data.isEmpty()) {
        throw IllegalArgumentException("klist is empty")
    }
    val sorted = data.sorted()
    val mid = sorted.size / 2
    if (sorted.size.isOdd()) {
        return sorted[mid]
    } else {
        return (sorted[mid - 1] + sorted[mid]) / 2
    }
}