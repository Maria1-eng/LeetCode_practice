package tyler.shapes

import kotlin.math.pow

class Circle(
    val radius: Double,
) : Shape() {

    fun computeDiameter(): Double = radius * 2.0

    override fun computeArea(): Double = Math.PI * radius.pow(x = 2.0)
    override fun describe() = "This is a Circle. It has an area of ${computeArea()} and a radius of $radius."
}