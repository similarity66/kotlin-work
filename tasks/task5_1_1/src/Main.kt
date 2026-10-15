// Task 5.1.1: main program
fun main (args: Array<String>) {
    val first = args[0]
    val second = args[1]
    if (anagrams(first, second) == true) {
        println("$first and $second are anagrams")
    } else {
        println("$first and $second are not anagrams")
    }
}