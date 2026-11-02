// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate

fun main() {
    val person = Person("ryoshu", birth = LocalDate(1998, 4, 4))
    person.name = ""
    println(person.name)
}