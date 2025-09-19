package tyler.shapes

import org.junit.jupiter.api.Test
import kotlin.math.pow
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotEquals
import kotlin.test.assertTrue


class ShapesTest {
    @Test
    fun `a Circle IS a Shape AND a Circle`() {
        val circle = Circle(radius = 1.0)

        // A circle is both a Circle and a Shape
        assertTrue(actual = circle is Circle)
        assertTrue(actual = circle is Shape)

        // A circle is not a Square
        assertFalse(actual = circle is Square)
    }

    @Test
    fun `describing a Square uses the default description because it is NOT overridden`() {
        val square = Square(sideLength = 1.0)

        val actualDescription = square.describe()
        val expectedDescription = SHAPE_DEFAULT_DESCRIPTION.format(square.computeArea())

        assertEquals(expectedDescription, actualDescription)
    }

    @Test
    fun `describing a Circle DOES NOT use the default description because it IS overridden`() {
        val circle = Circle(radius = 1.0)

        val actualDescription = circle.describe()
        val expectedDescription = "This is a Circle. It has an area of ${circle.computeArea()} and a radius of ${circle.radius}."
        val expectedDescriptionIfNotOverridden = SHAPE_DEFAULT_DESCRIPTION.format(circle.computeArea())

        assertEquals(expectedDescription, actualDescription)
        assertNotEquals(expectedDescriptionIfNotOverridden, actualDescription)
    }

    @Test
    fun `area calculates as expected for a Square`() {
        val square = Square(sideLength = 2.0)
        val actualArea = square.computeArea()
        val expectedArea = 2.0 * 2.0

        assertEquals(expectedArea, actualArea)
    }

    @Test
    fun `area calculates as expected for a Circle`() {
        val circle = Circle(radius = 2.0)
        val actualArea = circle.computeArea()
        val expectedArea = Math.PI * (2.0).pow(x = 2.0)

        assertEquals(expectedArea, actualArea)
    }
}