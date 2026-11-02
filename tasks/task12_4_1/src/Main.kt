// Task 12.4.1: main program
fun main() {
    val centre = Point(1.0, 2.0)
    val point = Point(0.0, 1.0)
    val circle1 = Circle(centre, 2.0)
    println(circle1.area())
    println(circle1.perimeter())
    if (circle1 contains Point(0.0, 1.0)) {
        println("point in circle")
    } else println("point not in circle")
}