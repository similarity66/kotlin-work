// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate
fun main() {
    val p1 = Person("ryoshu", birth = LocalDate(1998, 4, 4))
    println(p1.age)
}