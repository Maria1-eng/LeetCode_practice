package tyler

import fizzBuzz
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class FizzBuzzTest {
    @Test
    fun `the result of fizzbuzz six is exactly as expected`() {
        val result = fizzBuzz(6)
        val expected = listOf("1", "2", "Fizz", "4", "Buzz", "Fizz")

        assertEquals(expected, result)

    }

    @Test
    fun `lower limit returns one as expected`() {
        val result = fizzBuzz(1)
        val expected = listOf("1")

        assertEquals(expected, result)
    }

    @Test
    fun `upper limit returns Buzz as expected`() {
        val result = fizzBuzz(10000)

        assertEquals("Buzz", result[4])
        assertEquals("Buzz", result.last())
    }

    @Test
    fun `an input under the lower limit throws an exception`() {
        val exception = assertFailsWith<IllegalArgumentException> {
            fizzBuzz(0)
        }
        assertEquals("The value is too small.", exception.message)
    }

}