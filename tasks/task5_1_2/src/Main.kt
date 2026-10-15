// Task 5.1.2: main program
import kotlin.system.exitProcess
fun main(args: Array<String>) {
    if (args.size != 1) {
        println("give 1 value of dice sides in cli")
        exitProcess(1)
    }
    val diceSides = args[0].toInt()
    println(rollDie(diceSides))
}