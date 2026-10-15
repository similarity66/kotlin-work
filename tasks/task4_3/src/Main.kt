// Task 4.3: grade calculation using a when expression
import kotlin.math.roundToInt
import kotlin.system.exitProcess
fun main(args: Array<String>) {
    if (args.size != 3) {
        println("not enough raugments")
        exitProcess(1)
    }
    else {
        val sum = args[0].toDouble() + args[1].toDouble() + args[2].toDouble()
        val avgGrade: Double = sum/3
        val grade = when(avgGrade.roundToInt()) {
            in 0..39 -> "fail"
            in 40..69 -> "pass"
            in 70..100 -> "distinction"
            else -> "?"
        }
        print(grade)
    }
}