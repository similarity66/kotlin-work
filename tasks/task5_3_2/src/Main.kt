// Task 5.3.2: main program
import kotlin.system.exitProcess
fun main(args: Array<String>) {
    val input = args[0]
    if (input.substring(1, 2) == "d") {
        val sides = input.substring(2).toInt()
        val rolls = input.substring(0, 1).toInt()
        println(rollDie(sides, rolls))
    } else {
        println("use format RdS \nR = rolls S = sides")
        //exitProcess(1)
    }
}