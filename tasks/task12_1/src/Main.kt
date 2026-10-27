// Task 12.1: program that uses a Point object
fun main() {
    val p = Point(4.0, 4.0)
    val r = Point(4.5, 7.5)
    println(p.x)   // prints 0.0
    println(p.y)   // prints 0.0
    println(p.distance())
    println(p.distanceTo(r))
}
