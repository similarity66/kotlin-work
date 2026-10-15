// Task 8.5: example of using a higher-order function

fun main() {
    val text = readln()
    val blankSpaces = text.howMany {it ==  ' '}
    println("$blankSpaces blank spaces in text")
}
