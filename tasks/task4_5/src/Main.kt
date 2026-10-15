// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
        if (args.size != 1) {
        println("not enough raugments")
        exitProcess(1)
        }
    var sum: Long = 0
    for (i in 1..args[0].toInt() step 2) {
        sum += i
    }
    println("final sum = $sum")
}
