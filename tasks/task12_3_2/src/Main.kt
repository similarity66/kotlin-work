// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate
fun main() {
    val date = "1998-04-04"
    val person1 = Person("ryoshu", date)
    println("name: ${person1.name}, dob: ${person1.birth}, marital status: ${person1.isMarried}")
}
