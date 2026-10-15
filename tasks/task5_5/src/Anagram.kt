// Task 5.1.1: anagrams() function
infix fun String.anagramOf(str: String): Boolean = this.lowercase().toList().sorted() == str.lowercase().toList().sorted() == true