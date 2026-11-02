// COMP2850 Portfolio: Week 4
// Triangle class

import kotlin.math.sqrt

class Triangle(val sideA: Double, val sideB: Double, val sideC: Double) {
    val s = (sideA + sideB + sideC)/2
    val heron = s*(s - sideA)*(s - sideB)*(s - sideC)
    val area = Math.sqrt(heron)
    val perimeter = sideA + sideB + sideC
    val semiPerimeter = perimeter / 2

    override fun toString(): String = "Triangle($sideA, $sideB, $sideC)"
    init{
        require(sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) 
    }
}