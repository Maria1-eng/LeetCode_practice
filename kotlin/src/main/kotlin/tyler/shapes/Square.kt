package tyler.shapes

import kotlin.math.pow

class Square(
    sideLength: Double,
) : Shape() {

    val width = sideLength
    val height = sideLength

    override fun computeArea(): Double = width * height
}