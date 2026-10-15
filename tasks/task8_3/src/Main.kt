// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    val data = fetchData(args[0])
    val lowest = data.minBy { it.second }
    val highest = data.maxBy { it.second }
    val average = data.map { it.second }.average()
    val sortedList = data.sortedBy {it.first}
    println("Lowest = ${lowest.first} = ${lowest.second}, \nHighest = ${highest.first} = ${highest.second} \nAverage temp = ${average}")
    println(sortedList)
}

