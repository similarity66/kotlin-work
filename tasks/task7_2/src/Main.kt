// Task 7.2: array comparison
fun main() {
    val x = mutableListOf(9, 3, 6, 2, 8, 5, 4, 7, 1, 4, 4)
    x.addAll(listOf(10, 11, 12))
    x.removeAt(0)
    x.removeAll(listOf(4))
    x.remove(3)
    println(x)
}